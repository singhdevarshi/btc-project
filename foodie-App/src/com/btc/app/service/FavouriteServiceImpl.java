package com.btc.app.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.dao.FavouriteDaoJdbcImpl;
import com.btc.app.dao.FavouriteDao;
import com.btc.app.model.Favourite;

public class FavouriteServiceImpl implements FavouriteService{
	
	 private FavouriteDao daoObj;
		
		public FavouriteServiceImpl() {
			daoObj = new FavouriteDaoJdbcImpl();
		}

	@Override
	public Favourite addFavResto(Favourite favo) throws SQLException {
		// TODO Auto-generated method stub
		return daoObj.addFavResto(favo);
	}

	@Override
	public List<Favourite> displayFavResto(int userId) throws SQLException {
		// TODO Auto-generated method stub
		return daoObj.displayFavResto(userId);
	}

}
