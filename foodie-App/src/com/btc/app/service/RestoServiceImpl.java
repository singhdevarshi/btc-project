package com.btc.app.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.dao.RestoDao;
import com.btc.app.dao.RestoDaoJdbcImpl;
import com.btc.app.dao.UserDao;
import com.btc.app.dao.UserDaoJdbcImpl;
import com.btc.app.model.Restaurant;

public class RestoServiceImpl implements RestoService{
	
	 private RestoDao daoObj;
		
		public RestoServiceImpl() {
			daoObj = new RestoDaoJdbcImpl();
		}

	@Override
	public Restaurant addResto(Restaurant resto) throws SQLException {
		// TODO Auto-generated method stub
		return daoObj.addResto(resto);
	}

	@Override
	public List<Restaurant> searchRestoByLoc(String location) throws SQLException {
		// TODO Auto-generated method stub
		return daoObj.searchRestoByLoc(location);
	}

	@Override
	public boolean deleteResto(int restoId) throws SQLException {
		// TODO Auto-generated method stub
		return daoObj.deleteResto(restoId);
	}

	@Override
	public List<Restaurant> displayAllResto() throws SQLException {
		// TODO Auto-generated method stub
		return daoObj.displayAllResto();
	}

}
