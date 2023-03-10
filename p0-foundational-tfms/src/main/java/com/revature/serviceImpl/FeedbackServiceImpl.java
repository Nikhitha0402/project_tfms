package com.revature.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.apache.log4j.Logger;
import com.revature.model.Feedback;
import com.revature.model.QuestionManagement;
import com.revature.service.FeedbackService;
import com.revature.util.QuestionsSection;
import com.revature.application.App;

public class FeedbackServiceImpl implements FeedbackService {
	private static final Logger logger = Logger.getLogger(FeedbackServiceImpl.class);

	@Override
	public void setFeedbackInput(Feedback F) {

		try {
			Connection connection = App.con;
			Statement stmt = connection.createStatement();
			String sql = "SELECT * FROM Question_management";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				QuestionManagement q = new QuestionManagement();
				q.setQuestion_id(rs.getString("question_id"));
				String qs = rs.getString("question_section");
				if (qs.equals("INSTRUCTOR")) {
					q.setQuestionSection(QuestionsSection.INSTRUCTOR);
				} else if (qs.equals("COURSEMATERIAL")) {
					q.setQuestionSection(QuestionsSection.COURSEMATERIAL);
				} else if (qs.equals("JOBIMPACT")) {
					q.setQuestionSection(QuestionsSection.JOBIMPACT);
				} else if (qs.equals("ENVIRONMENT")) {
					q.setQuestionSection(QuestionsSection.ENVIRONMENT);
				} else if (qs.equals("LEARNINGEFFECTIVENESS")) {
					q.setQuestionSection(QuestionsSection.LEARNINGEFFECTIVENESS);
				}

				q.setQuestionText(rs.getString("question_text"));
				App.QuestionList.add(q);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// F.setTraineeId(tempAssociateId);
		logger.info("\nEnter the Trainer ID");
		String trainerName = sc.nextLine();

		logger.info("\nEnter the Associate ID");
		String traineeName = sc.nextLine();

		logger.info("\nEnter the Topic");
		String topic = sc.nextLine();

		logger.info("\nEnter the rating for below questions");

		try {

			Connection connection = App.con;
			for (QuestionManagement i : App.QuestionList) {
				logger.info("\n" + i.getQuestionText());
				String rating = sc.nextLine();

				String sql = "insert into Capture_Feedback(trainer_id,Associate_id,topic_name,question_id,rating)VALUES(?,?,?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);

				ps.setString(1, trainerName);
				ps.setString(2, traineeName);
				ps.setString(3, topic);
				ps.setString(4, i.getQuestionId());
				ps.setString(5, rating);
				ps.executeUpdate();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		logger.info("\n*******Thank You For Your Valueable Feedback*******");
	}

	@Override
	public void showFeedbackDetailsByParameters() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {

			Connection connection = App.con;
			int checkShow = 0;

			do {
				logger.info("\n1 - Show Average Rating according to Topic and Section");
				logger.info("\n2 - Show Average Rating according to Trainer Name");
				logger.info("\n3 - Show Overall Average Rating ");
				logger.info("\n0 - Exit");
				checkShow = sc.nextInt();
				sc.nextLine();

				switch (checkShow) {
				case 1:
					Statement stmt = connection.createStatement();
					String sql = "select c.topic_name as 'Topic',q.question_section as 'Section',avg(c.rating) as 'Average Rating by Section' from capture_feedback c join question_management q on c.question_id=q.question_id group by c.topic_name, q.question_section";

					// PreparedStatement ps=connection.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery(sql);
					logger.info("\nTopic" + " --->" + "Section" + " --->" + "Average Rating");
					while (rs.next()) {
						logger.info("\n" + rs.getString(1) + "    " + rs.getString(2) + "    " + rs.getString(3));

					}
					break;
				case 2:
					Statement stmt1 = connection.createStatement();
					String sql1 = "select t.trainer_name as 'Trainer',avg(c.rating) as 'Average Trainer Rating'from capture_feedback c join trainer_details t on c.trainer_id=t.trainer_id group by c.trainer_id";

					ResultSet rs1 = stmt1.executeQuery(sql1);
					logger.info("\nTrainer Name" + "    " + "Average Rating");
					while (rs1.next()) {
						logger.info(rs1.getString(1) + " --->" + rs1.getString(2));

					}
					break;
				case 3:
					Statement stmt2 = connection.createStatement();
					String sql2 = "select avg(rating) from capture_feedback;";

					ResultSet rs2 = stmt2.executeQuery(sql2);
					while (rs2.next()) {
						logger.info("\nOverall Rating --->" + rs2.getString(1));

					}
					break;
				}

			} while (checkShow != 0);
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}