package com.java.demo.Service;

import java.util.List;

import com.java.Model.Student;
import com.java.Student.Dao.IStudentDao;

public class StudentService {

	IStudentDao dao = new IStudentDao();

	public void addData(Student s) {

		dao.insert1(s);

	}

	public void removedata(int rollno) {

		dao.remove(rollno);
	}

	public List<Student> showall() {
		List<Student> list = dao.showall();
		return list;
	}

	public void Update(double fee , int rollno) {
		dao.update(fee, rollno);
	}
}
