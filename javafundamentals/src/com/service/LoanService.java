package com.service;
/*
 * author:vinay
 */
import com.util.Stringutil;

public class LoanService {

	public String computeloan(String fname, String lname)
	{
		//Stringutil stringutil = new Stringutil();
		// we have to give this when we don't use static in stringutil
		return Stringutil.concatName(fname, lname);
	}

}
