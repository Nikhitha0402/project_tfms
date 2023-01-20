package com.revature.dao.impl.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.dao.UserDao;
import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.User;

public class UserTest {
	@Test
	public void userAuthenticationTest() {
		UserDao user=new UserDaoImpl();
		User result=new User();
		User u=new User("Nikhitha","n123","associate");
		result=user.getUserForTest(u);
		assertEquals(result.getUsername(),u.getUsername());
	}
}

