package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Venue;
import com.mysql.jdbc.PreparedStatement;
import com.util.DBUtil;

public class VenueDaoImpl implements VenueDao {

	public List<Venue> getAllVenues() throws SQLException {
		List<Venue> list = new ArrayList<>();
		Connection conn = DBUtil.getDBconn();
		//step 1:prepare the statement
		String sql="select * from venue";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		// execute the statement
		ResultSet rst =pstmt.executeQuery();		
		// Iterate over the result set and read db column 
		while(rst.next()) {
			int id = rst.getInt("id");
			String venueName = rst.getString("venue_name");
			String address = rst .getString("address");
			// save it in object 
			Venue venue = new Venue(id , venueName, address);
			// add this obj to the list
			list.add(venue);
		}
		DBUtil.dbclose();
		return list;
	}

	@Override
	public Venue getVenueById(int id) throws SQLException {
		Connection conn = DBUtil.getDBconn();
		// step 1:prepare the statement
		String sql = "select * from venue where id=?";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        // Attach the value to ?
		pstmt.setInt(1,id);
		// execute the statement
		ResultSet rst =pstmt.executeQuery();
		// Iterate over the result set and read db column 
		if(rst.next()) {// if id is present show the data else nullpointerE
				int vid = rst.getInt("id");
				String venueName = rst.getString("venue_name");
				String address = rst .getString("address");
				// save it in object 
				Venue venue = new Venue(id , venueName, address);
				return venue;
				}
		DBUtil.dbclose();
		throw new NullPointerException("Invalid ID given");
	}

	

}
