package com.harini.day1;

public class SearchInLinear {
	public static String linearSearch(int[] array, int key) {
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				System.out.println("Found at " + (i + 1));
				return "found";
			}
			c++;
			if (c == array.length) {
				System.out.println("Not Found");
				return "not found";
			}
		}
		return "not found";
	}

}
