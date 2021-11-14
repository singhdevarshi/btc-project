package com.btc.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.model.Favourite;

public interface FavouriteDao {

	Favourite addFavResto(Favourite favo) throws SQLException;

	List<Favourite> displayFavResto(int userId) throws SQLException;
	

}
