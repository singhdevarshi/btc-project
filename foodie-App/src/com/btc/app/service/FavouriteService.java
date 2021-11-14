package com.btc.app.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.model.Favourite;
import com.btc.app.model.Restaurant;

public interface FavouriteService {
	
	public Favourite addFavResto(Favourite favo) throws SQLException;
	
	public List<Favourite> displayFavResto(int userId) throws SQLException;
}
