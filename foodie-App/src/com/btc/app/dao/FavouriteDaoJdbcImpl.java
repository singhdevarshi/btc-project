package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.btc.app.exception.DuplicateDataException;
import com.btc.app.model.Favourite;
import com.btc.app.model.Restaurant;

public class FavouriteDaoJdbcImpl implements FavouriteDao{
	
	 private Connection con;
		
	 private PreparedStatement smt;

	@Override
	public Favourite addFavResto(Favourite favo) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into favourite values(?,?,?)";
		try {
		   con=ConnectionUtil.getDbConnection();
		   smt= con.prepareStatement(query);
		
			smt.setInt(1, favo.getFavId());
			smt.setInt(2, favo.getUserId());
			smt.setString(3, favo.getRestoName());
			
			int insertedRowCount = smt.executeUpdate();
			if(insertedRowCount>0) {
				return favo;
			}
		} catch (DuplicateDataException | SQLException e) {
			// TODO: handle exception
		   throw new DuplicateDataException("Already Exists");
		}
		
		return null;
	}

	@Override
	public List<Favourite> displayFavResto(int userId) throws SQLException {
		// TODO Auto-generated method stub
		String query="select * from favourite where userid =?";
		con=ConnectionUtil.getDbConnection();
		smt= con.prepareStatement(query);
		smt.setInt(1, userId);
		
		ResultSet rst = smt.executeQuery();
		
		List<Favourite> fevo=new ArrayList<Favourite>();
		
		while(rst.next()) {
			Favourite fs = new Favourite();
			fs.setFavId(rst.getInt("fid"));
			fs.setUserId(rst.getInt("userid"));
			fs.setRestoName(rst.getString("restoname"));
			fevo.add(fs);
		}
		
		return fevo;
	}

}
