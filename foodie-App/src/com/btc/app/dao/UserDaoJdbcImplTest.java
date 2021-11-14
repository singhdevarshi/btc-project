package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Restaurant;
import com.btc.app.model.User;

class UserDaoJdbcImplTest {
	UserDao uDao = new UserDaoJdbcImpl();
//	@Test
//	void testAddUser() throws SQLException {
//		User ump=new User(1007,"Avi Reddy","123456789",20,"avire@gmail.com",12345678);
//		
//		assertEquals(ump, uDao.addUser(ump));
//		
//	}
	
	@Test
	void testSearchUserById() throws SQLException {
		assert(uDao.searchUserById(1005)) != null;
	}
//	@Test
//	void testDeleteUserById() throws SQLException {
//		assert(uDao.deleteUserById(1006));
//	}
//	@Test
//	void testUpdateUser() throws SQLException {
//		User ump=new User(1007,"Avi Reddy","123456789",20,"avire@gmail.com",12345678);
//		assertEquals(ump, uDao.updateUser(ump));
//	}
	
	@Test
	void testGetAllUser() throws SQLException {
		List<User> ust =uDao.getAllUser();
		assertEquals(ust, uDao.getAllUser());
	}
	
	@Test
	void testUserLogin() throws SQLException
	{
		String email ="deva@gmail.com";
		String password ="123456789";
		assertTrue(uDao.userLogIn(email, password));
	}
}
