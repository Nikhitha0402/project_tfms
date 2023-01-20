package com.revature.model;
import java.util.Date;
public class Batch {
private String topicName;
private int batchDuration;
Date startDate=new Date();
Date endDate=new Date();
public Batch(String topicName, int batchDuration, Date startDate, Date endDate) {
	super();
	this.topicName = topicName;
	this.batchDuration = batchDuration;
	this.startDate = startDate;
	this.endDate = endDate;
}
public Batch() {
	super();
}
public String getTopicName() {
	return topicName;
}
public void setTopicName(String topicName) {
	this.topicName = topicName;
}
public int getBatchDuration() {
	return batchDuration;
}
public void setBatchDuration(int batchDuration) {
	this.batchDuration = batchDuration;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}

}