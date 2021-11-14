package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Favourite;

class FavouriteDaoJdbcImplTest {

	FavouriteDao fDao = new FavouriteDaoJdbcImpl();

//	@Test
//	void testAddFavo() throws SQLException
//	{
//		Favourite fav = new Favourite(1003,1002, "Sharma Vishnu");
//		assertEquals(fav, fDao.addFavResto(fav));
//	}
	
	@Test
	void testGetAllFavourite() throws SQLException {
		List<Favourite> fst =fDao.displayFavResto(1002);
		assertEquals(fst, fDao.displayFavResto(1002));
	}

}
