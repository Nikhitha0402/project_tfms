package com.revature.model;

public class Feedback {
	private String topicName;
	private String questionText;
	int rating;
	String questionSection;
	String questionId;

	public Feedback(String topicName, String questionText, int rating, String questionSection) {
		super();
		this.topicName = topicName;
		this.questionText = questionText;
		this.rating = rating;
		this.questionSection = questionSection;
	}

	public Feedback() {
		super();
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getQuestionSection() {
		return questionSection;
	}

	public void setQuestionSection(String questionSection) {
		this.questionSection = questionSection;
	}

}
