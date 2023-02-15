package com.revature.service;

import java.util.ArrayList;

public interface Trainer {
	static ArrayList<Trainer> trainerList = new ArrayList<Trainer>();

	public abstract void addDetails() throws Exception;

	public abstract void showTrainerDetails();

	public abstract void deleteTrainerDetails();

	public abstract void editTrainerDetails();
}
