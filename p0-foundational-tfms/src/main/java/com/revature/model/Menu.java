package com.revature.model;

import com.revature.serviceImpl.FeedbackServiceImpl;

public class Menu {
	public static void main(String[] args) {
	}

	public static void menu() {
		FeedbackServiceImpl fs = new FeedbackServiceImpl();
		fs.showFeedbackDetailsByParameters();
	}
}
