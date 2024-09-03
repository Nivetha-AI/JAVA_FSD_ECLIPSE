package com.hexa.Springannotation.com.hexa.Springannotation;

import org.springframework.context.annotation.Bean;

public class StudentConfig {

	@Bean(name="stud1", initMethod="init", destroyMethod="destroy")
	public Student getStudent() {
		Student s1=new Student();
		s1.setRoll(101);
		s1.setName("Asha");
		s1.setFee(20000.0);
		
		return s1;
	}
	@Bean(name="stud2")
	public Student getStudent1() {
		Student s1=new Student();
		s1.setRoll(102);
		s1.setName("Priya");
		s1.setFee(10000.0);
		
		return s1;
	}
	
	@Bean(name="res1")
	public Result getResult() {
		Result r1= new Result();
		r1.setMarks(99);
		r1.setRemarks("pass");
		return r1;
	}
//	@Bean(name="res2")
//	public Result getResult1() {
//		Result r1= new Result();
//		r1.setMarks(99);
//		r1.setRemarks("pass");
//		return r1;
//	}
	
}
