package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Restaurant;

class RestoDaoJdbcImplTest {
	
	RestoDao rDao = new RestoDaoJdbcImpl();

//	@Test
//	void testAddResto() throws SQLException
//	{
//		Restaurant resto = new Restaurant(1003,"Sharma Vishnu", "Bhopal","Veg","All");
//		assertEquals(resto, rDao.addResto(resto));
//	}
	
	@Test
	void testSearchRestoByLoc() throws SQLException
	{
		List<Restaurant> rst =rDao.searchRestoByLoc("Bangalore");
		assertEquals(rst, rDao.searchRestoByLoc("Bangalore"));
	}
	
//	@Test
//	void testDeleteRestoById() throws SQLException {
//		assertTrue(rDao.deleteResto(1001));
//	}
	
	@Test
	void testGetAllResto() throws SQLException {
		List<Restaurant> rst =rDao.displayAllResto();
		assertEquals(rst, rDao.displayAllResto());
	}

}
