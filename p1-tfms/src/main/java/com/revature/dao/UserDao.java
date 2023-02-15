package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.model.User;

public interface UserDao {
	static List<User>UserInfo=new ArrayList<>();
	public boolean checkValidUser(String username, String password);
	public String checkUserRole(String admin,String associate);
	User getUserForTest(User uu);
}

