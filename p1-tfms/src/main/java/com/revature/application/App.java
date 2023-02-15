package com.revature.application;

import java.sql.Connection;
import java.util.*;
import org.apache.log4j.Logger;
import com.revature.config.ConnectionFactory;
import com.revature.dao.FeedbackDao;
import com.revature.dao.UserDao;
import com.revature.daoImpl.FeedbackDaoImpl;
import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.QuestionManagement;

public class App {
	private static final Logger logger = Logger.getLogger(App.class);
	public static List<QuestionManagement> QuestionList = new ArrayList<>();
	public static Connection con = ConnectionFactory.getConnection();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			logger.info("\n**********Welcome to Training Feedback Management System**********");
			logger.info("\nEnter username");
			String username = sc.nextLine();
			logger.info("Enter Password");
			String password = sc.nextLine();
			String role = "";
			UserDao u = new UserDaoImpl();
			if (u.checkValidUser(username, password)) {
				role = u.checkUserRole(username, password);

			}

			FeedbackDao feedbackObj = new FeedbackDaoImpl();

			if (role.equals("admin")) {
				feedbackObj.showFeedback();
			} else if (role.equals("associate")) {
				feedbackObj.setFeedback();
			}
			}
	}
}


