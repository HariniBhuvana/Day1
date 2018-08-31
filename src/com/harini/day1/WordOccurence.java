package com.harini.day1;

public class WordOccurence {
	public static int searchName(String[] name, String searchName) {
		int count = 0;
		for(int i=0; i<name.length; i++) {
			if(name[i].equals(searchName)) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}


}
