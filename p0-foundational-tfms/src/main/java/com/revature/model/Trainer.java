package com.revature.model;

public class Trainer {
private String trainerId;
protected String trainerName;
protected String trainerQual;
protected String trainerExp;
public Trainer(String trainerId, String trainerName, String trainerQual, String trainerExp) {
	super();
	this.trainerId = trainerId;
	this.trainerName = trainerName;
	this.trainerQual = trainerQual;
	this.trainerExp = trainerExp;
}
public Trainer() {
	super();
}
public String getTrainerId() {
	return trainerId;
}
public void setTrainerId(String trainerId) {
	this.trainerId = trainerId;
}
public String getTrainerName() {
	return trainerName;
}
public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}
public String getTrainerQual() {
	return trainerQual;
}
public void setTrainerQual(String trainerQual) {
	this.trainerQual = trainerQual;
}
public String getTrainerExp() {
	return trainerExp;
}
public void setTrainerExp(String trainerExp) {
	this.trainerExp = trainerExp;
}
public void setQualification(String qualification) {
	// TODO Auto-generated method stub
	
}
public void setTrack(String track) {
	// TODO Auto-generated method stub
	
}
public void setExperience(int experience) {
	// TODO Auto-generated method stub
	
}


}

