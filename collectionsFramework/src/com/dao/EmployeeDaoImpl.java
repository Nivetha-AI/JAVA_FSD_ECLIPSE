package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.SqlOperationFailedException;
import com.model.Employee;
import com.mysql.jdbc.PreparedStatement;

public class EmployeeDaoImpl {
	DBConnector db = new DBConnector();
	Connection conn;
	public List<Employee> fetchEmployees() { 
		//call dbconnect()//
		conn =db.dbconnect();
    List<Employee> list = new ArrayList<>();//container
    
    // fetch data from db 
    String sql ="select * from Employee";
   
     
     try {
    	//step 1:prepare the statement to execute
    	 PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql);
    	 
    // step 2:execute the statement and catch in the resultset
    	 ResultSet rst = pstmt.executeQuery();
    	 
    //step 3: read the resultset and Iterate over it to save the object
       while(rst.next()) {
    	   int id = rst.getInt("Id");
    	   String name = rst.getString("name");
    	   double Salary= rst.getDouble("Salary");
    	   Employee e = new Employee();
    	   e.setId(id);
    	   e.setName(name);
    	   e.setSalary(Salary);
    	   list.add(e);
    	 }
    	 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  
    db.dbclose();
    return list;
}
	public void insertEmployee(Employee emp)throws SqlOperationFailedException, SQLException {
		conn=db.dbconnect();
		String sql = "insert into employee(name ,city , salary , date_of_joining,department) values (?,?,?,?,?)";
		// prepare the statement
   	  PreparedStatement pstmt =  (PreparedStatement) conn.prepareStatement(sql);
	  // attach the values to ?
	pstmt.setString(1,emp.getName());
	pstmt.setString(2,emp.getCity());
	pstmt.setDouble(3,emp.getSalary());
	pstmt.setString(4,emp.getDateOfJoining().toString());
	pstmt.setString(5,emp.getDepartment());
    // execute the query
		
		int response = pstmt.executeUpdate();//1:success ,0:failure
		if(response==0) {
			throw new SqlOperationFailedException("Employee Insertion Problem");
		}
		
		db.dbclose();	
		
	}
	public void deleteEmployee(int id) {
		conn = db.dbconnect();
		String sql ="delete from employee where id =?";
		// prepare the statement
		try {
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
			// attach the values to ?
			pstmt.setInt(1,id);
			// execute the query
			pstmt.executeUpdate();
			} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
		db.dbclose();
		
	
		
	}
	public void updateEmployee(int eid, String ename, double esalary) {
		conn = db.dbconnect();
		String sql ="update employee set name=? , salary=? where id =?";
		// prepare the statement
		try {
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
			// attach the values to ?
			pstmt.setString(1, ename);
			pstmt.setDouble(2, esalary);
			pstmt.setInt(3,eid);
			// execute the query
			pstmt.executeUpdate();
			} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
		db.dbclose();
		
	}
}