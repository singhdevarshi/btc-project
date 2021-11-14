package com.btc.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.model.Restaurant;

public interface RestoDao {
	public Restaurant addResto(Restaurant resto) throws SQLException;
	
	public List<Restaurant> searchRestoByLoc(String location) throws SQLException;
	
	public boolean deleteResto(int restoId) throws SQLException;
	
	public List<Restaurant> displayAllResto() throws SQLException;
}
