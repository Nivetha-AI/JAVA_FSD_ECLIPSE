package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApp {
 
	
	@BeforeClass
	public static void beforeClass() {// this method belongs to the class
		System.out.println("Before class @BeforeClass");
		
	}
	@Before
	public void beforetest()
{
		System.out.println("Before test call @before");}
	@Test
	public void testTask() {
		System.out.println("this is my method having @test");
	}
	@Test
	public void testTask1() {
		System.out.println("this is my method no 2 having @test");
	}
	@After
	public void aferTest() {
		System.out.println("After test call @After");
	}
	@AfterClass
	public static void afterClass() {// this method belongs to the class
		System.out.println("After class @afterclass");
	}
}
//output
//Before class @BeforeClass
//Before test call @before
//this is my method no 2 having @test
//After test call @After
//Before test call @before
//this is my method having @test
//After test call @After
//After class @afterclass
