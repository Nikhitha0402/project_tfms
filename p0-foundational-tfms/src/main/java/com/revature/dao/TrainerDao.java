package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import com.revature.model.Trainer;

public interface TrainerDao {
	public static List<Trainer> trainerList = new ArrayList<>();

	public void setTrainer();
}
