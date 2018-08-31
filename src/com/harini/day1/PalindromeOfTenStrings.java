package com.harini.day1;

public class PalindromeOfTenStrings {
	private String[] stringArray;

	public PalindromeOfTenStrings(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public String[] checkForPalindromandSetAlphabetically() {
		String[] collectedArray = new String[2];
		int index = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (palindromCheck(reverseString(stringArray[i]))) {
				collectedArray[index++] = new String(setAlphabetically(stringArray[i]));
			}
		}
		System.out.println(collectedArray[0]);
		return collectedArray;
	}

	private String reverseString(String sentence) {
		StringBuffer outputSentence;
		StringBuffer buffer = new StringBuffer(sentence);
		outputSentence = buffer.reverse();
		return outputSentence.toString();
	}

	private Boolean palindromCheck(String string) {
		if (string.equals(reverseString(string))) {
			return true;
		}
		return false;
	}

	private char[] setAlphabetically(String string) {
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length - i - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}
			}
		}
		return charArray;
	}

}
