package com.java.Student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.Connect.DataConnect;
import com.java.Model.Student;

public class IStudentDao {

	Connection con;
	PreparedStatement stat;

	public IStudentDao() {
		con = DataConnect.getConnect();

	}

	public void insert1(Student s) {

		try {
			stat = con.prepareStatement("insert into student values(?,?,?)");
			stat.setInt(1, s.getRollno());
			stat.setString(2, s.getName());
			stat.setDouble(3, s.getFee());

			stat.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public void remove(int rollno) {
		String sql = "delete from student where rollno=?";
		try {
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
			// attach the values to ?
			pstmt.setInt(1, rollno);
			// execute the query
			int k = pstmt.executeUpdate();
			if (k > 0) {

				System.out.println("Removed");
			} else {
				System.out.println(" not Removed");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<Student> showall() {

		List<Student> list = new ArrayList<>();// container

		// fetch data from db
		String sql = "select * from Student";

		try {
			// step 1:prepare the statement to execute
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);

			// step 2:execute the statement and catch in the resultset
			ResultSet rst = pstmt.executeQuery();

			// step 3: read the resultset and Iterate over it to save the object
			while (rst.next()) {
				int rollno = rst.getInt("rollno");
				String name = rst.getString("name");
				double fee = rst.getDouble("fee");
				Student s = new Student();
				s.setRollno(rollno);
				s.setName(name);
				s.setFee(fee);
				list.add(s);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public void update(double fee ,int rollno) {
      String sql="update Student set fee=? where rollno=?";
      
		try {
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setDouble(1, fee);
			pstmt.setInt(2, rollno);
			int k1= pstmt.executeUpdate();
			if (k1 > 0) {

				System.out.println("Updated");
			} else {
				System.out.println(" not Updated");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
