package com.service;

import com.exception.InvalidCredentialsException;
import com.util.LoginUtil;

public class LoginService  {
      
	public void verifyUsername(String username) throws InvalidCredentialsException {
		if(! LoginUtil.VerifyUsername( username) )
		     throw new InvalidCredentialsException("Inavalid Credentials");
		
	}

	public void verifyPassword(String username, String password) throws InvalidCredentialsException {
		if(!LoginUtil.login(username, password))

		throw new InvalidCredentialsException("Inavalid Credentials");

	}

}
