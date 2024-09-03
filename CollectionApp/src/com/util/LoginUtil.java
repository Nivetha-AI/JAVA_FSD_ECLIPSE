package com.util;

import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
   static Map<String , String> map = new HashMap<>();
   public static Map<String ,String > data(){
	   map.put("harry", "potter");
	   map.put("hermione", "granger");
	   map.put("ronald", "weasley");
	   return map;
   }
   
   public static boolean login (String username , String password) {
	    Map<String ,String >map= data();
	    String syspass = map.get(username);
	    if(syspass.equals(password))
	    	return true;
	   return false;
   
   }
 
public static boolean VerifyUsername(String username) {
	  Map<String ,String >map= data();
	    for(String key :map.keySet()) {
	    	if(key.equals(username))
	    		return true;
	    	
	    }
	    return false;
}


   
   
}
