package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.btc.app.exception.DuplicateDataException;
import com.btc.app.model.Restaurant;
import com.btc.app.model.User;

public class RestoDaoJdbcImpl implements RestoDao{
	
	 private Connection con;
		
	private PreparedStatement smt;


	@Override
	public Restaurant addResto(Restaurant resto) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into restaurant values(?,?,?,?,?)";
		try {
		   con=ConnectionUtil.getDbConnection();
		   smt= con.prepareStatement(query);
		
			smt.setInt(1, resto.getRestaurantID());
			smt.setString(2, resto.getRestaurantName());
			smt.setString(3, resto.getRestaurantLocation());
			smt.setString(4, resto.getRestaurantType());
			smt.setString(5, resto.getRestaurantCategory());
			
			int insertedRowCount = smt.executeUpdate();
			if(insertedRowCount>0) {
				return resto;
			}
		} catch (DuplicateDataException | SQLException e) {
			// TODO: handle exception
		   throw new DuplicateDataException("Restaurant Already Exists");
		}
		
		return null;
	}

	@Override
	public List<Restaurant> searchRestoByLoc(String location) throws SQLException {
		// TODO Auto-generated method stub
		String query="select * from restaurant where location=?";
		con=ConnectionUtil.getDbConnection();
		smt=con.prepareStatement(query);
		
		smt.setString(1, location);	
		
		ResultSet queryResult = smt.executeQuery();
		
		List<Restaurant> resto=new ArrayList<Restaurant>();
		Restaurant rs=null;
		
		while(queryResult.next()) {
			rs=new Restaurant();
			rs.setRestaurantID(queryResult.getInt("rid"));
			rs.setRestaurantName(queryResult.getString("rname"));
			rs.setRestaurantLocation(location);
			rs.setRestaurantType(queryResult.getString("rtype"));
			rs.setRestaurantCategory(queryResult.getString("category"));
			resto.add(rs);
		}
		
		return resto;
	}

	@Override
	public boolean deleteResto(int restoId) throws SQLException {
		// TODO Auto-generated method stub
		 String query = "delete from restaurant where rid=?";
		   con=ConnectionUtil.getDbConnection();
		   smt= con.prepareStatement(query);
		   smt.setInt(1, restoId);
		   int deleted = smt.executeUpdate();
		   if(deleted==0)
		   {
			   return false;
		   }else {
			   return true;
		   }
	}

	@Override
	public List<Restaurant> displayAllResto() throws SQLException {
		// TODO Auto-generated method stub
		String query="select * from restaurant";
		con=ConnectionUtil.getDbConnection();
		smt= con.prepareStatement(query);
		
		ResultSet rst = smt.executeQuery();
		
		List<Restaurant> resto=new ArrayList<Restaurant>();
		
		while(rst.next()) {
			Restaurant rs = new Restaurant();
			rs.setRestaurantID(rst.getInt("rid"));
			rs.setRestaurantName(rst.getString("rname"));
			rs.setRestaurantLocation(rst.getString("location"));
			rs.setRestaurantType(rst.getString("rtype"));
			rs.setRestaurantCategory(rst.getString("category"));
			resto.add(rs);
		}
		
		return resto;
	}

}
