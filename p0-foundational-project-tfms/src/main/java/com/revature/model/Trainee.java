package com.revature.model;

public class Trainee {
private String traineeId;
protected String traineeName;
protected String traineeQual;
protected String traineeExp;
public Trainee(String traineeId, String traineeName, String traineeQual, String traineeExp) {
	super();
	this.traineeId = traineeId;
	this.traineeName = traineeName;
	this.traineeQual = traineeQual;
	this.traineeExp = traineeExp;
}
public Trainee() {
	super();
}
public String getTraineeId() {
	return traineeId;
}
public void setTraineeId(String traineeId) {
	this.traineeId = traineeId;
}
public String getTraineeName() {
	return traineeName;
}
public void setTraineeName(String traineeName) {
	this.traineeName = traineeName;
}
public String getTraineeQual() {
	return traineeQual;
}
public void setTraineeQual(String traineeQual) {
	this.traineeQual = traineeQual;
}
public String getTraineeExp() {
	return traineeExp;
}
public void setTraineeExp(String traineeExp) {
	this.traineeExp = traineeExp;
}

}