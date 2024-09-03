package com.controller;

import java.util.Scanner;

import com.exception.InvalidCredentialsException;
import com.service.LoginService;

public class LoginController {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	LoginService loginService = new LoginService();
	
	System.out.println("************LOGIN****************");
	System.out.println("Enter UserName");
	String username = sc.next();
	
	
	try {
		loginService.verifyUsername(username);
		System.out.println("Enter password");
		String password = sc.next();
		loginService.verifyPassword(username , password);
		System.out.println("Welcome "+ username);
	} catch (InvalidCredentialsException e) {
		System.out.println(e.getMessage());
	}
	
}
}
