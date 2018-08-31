package com.harini.day1;

public class CUI {
	public static String username = "abc";
	public static String password = "harin";
	public static String finduserandpassword(String usernam,String passwrd) {
		
	
	
	for (int i = 0; i < 3; i++) {
		
		if ((username.equals(usernam)) && (password.equals(passwrd))) {
			System.out.println("Welcome " + username);
			return "welcome";
			
		}
		
			}
	System.out.println("Contact Admin");
	return "contact";
	}
}

	
	


