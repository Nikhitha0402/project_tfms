package com.revature.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.config.ConnectionFactory;

/**
 * Servlet implementation class Done
 */
public class Done extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Done() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
		String userName=LoginAuthentication.x;
		System.out.println(request.getParameter("fname1"));
		
		
		
		int j=0;
		List<String>li=new ArrayList<>();
		List<String>id=new ArrayList<>();
		while(request.getParameter("fname"+j)!=null) {
			li.add(request.getParameter("fname"+j));
			j++;
			
		}
		
		
		Connection connection = ConnectionFactory.getConnection();
        Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("SELECT * FROM Question_management") ;
			while(resultset.next()) {
				id.add(resultset.getString(1));
			}
			
		
	   		for(int i=0;i<8;i++){
	   		String trainerName="1001";
		   	String traineeName=userName;
		   	String topic="core java";
		   	String sql="INSERT INTO Capture_Feedback(trainer_id,Associate_id,topic_name,question_id,rating)VALUES(?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			
			ps.setString(1, trainerName);
			ps.setString(2, traineeName);
			ps.setString(3, topic);
			ps.setString(4, id.get(i));
			ps.setString(5, li.get(i));
			ps.executeUpdate(); 
	   		}
	   	}
	   	catch (SQLException e) {
				e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/Thankyou.jsp");

		dispatcher.include(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}


