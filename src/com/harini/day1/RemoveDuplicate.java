package com.harini.day1;

public class RemoveDuplicate {
	public static String removeDuplicate(String string) {
		StringBuffer newString = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			Boolean present = false;
			for (int j = 0; j < newString.length(); j++) {
				if (string.charAt(i) == newString.charAt(j)) {
					present = true;
					break;
				}
			}
			if (present == false) {
				newString.append(String.valueOf(string.charAt(i))); 
			}
		}
		System.out.println(newString);
		return newString.toString();
	}

}
