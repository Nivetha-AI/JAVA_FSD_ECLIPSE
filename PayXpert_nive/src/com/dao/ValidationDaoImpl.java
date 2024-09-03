package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exception.EmployeeNotFoundException;
import com.exception.ValidationException;
import com.util.DBUtil;

public class ValidationDaoImpl implements ValidationDao{

	@Override
	public void validateUser(String username) throws SQLException, EmployeeNotFoundException {
		Connection conn=DBUtil.getDBconn();
		String email= "";
		String sql="select email from employee where email=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, username);
		/* execute the statement */
		ResultSet rst= pstmt.executeQuery();
		if(rst.next()) { 
			email = rst.getString("email");
		}
		if(email.equals("")) {
			throw new EmployeeNotFoundException("User not found");
		}
		
		DBUtil.dbclose();
	}

	@Override
	public void validatePassword(String username, int password) throws SQLException, ValidationException {
		Connection conn=DBUtil.getDBconn();
		int empID = -1;
		String sql="select id from employee where email=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, username);
		/* execute the statement */
		ResultSet rst= pstmt.executeQuery();
		if(rst.next()) { 
			empID = rst.getInt("id");
		}
		if(empID != password) {
			throw new ValidationException("Password Incorrect");
		}
		
		DBUtil.dbclose();	
	}

	@Override
	public int getEmployeeId(String username) throws SQLException {
		Connection conn=DBUtil.getDBconn();
		int id=-1;
		String sql="select id from employee where email=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, username);
		/* execute the statement */
		ResultSet rst= pstmt.executeQuery();
		if(rst.next()) { 
			id = rst.getInt("id");
		}
		DBUtil.dbclose();
		
		return id;
	}

	@Override
	public String getPositionForEmployee(int employeeId) throws SQLException {
		Connection conn=DBUtil.getDBconn();
		String position = "";
		String sql="select position from employee where id=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, employeeId);
		/* execute the statement */
		ResultSet rst= pstmt.executeQuery();
		if(rst.next()) { 
			position = rst.getString("position");
		}
		DBUtil.dbclose();
		
		return position;
	}

}
