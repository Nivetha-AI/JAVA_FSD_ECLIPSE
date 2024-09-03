package com.service;
/*
 * author:divya
 */
import com.util.Stringutil;

public class EmailService {

	public String sendemail(String fname, String lname) {
		//Stringutil stringutil = new Stringutil();
				// we have to give this when we don't use static in stringutil
		return Stringutil.concatName(fname , lname);
	}

}
