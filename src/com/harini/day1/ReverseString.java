package com.harini.day1;

public class ReverseString {
	public static String reverseinput(String sentence) {
		StringBuffer outputWord;
		StringBuffer outputSentence = new StringBuffer();
		StringBuffer space = new StringBuffer(" ");
		String[] sentenceArray = sentence.split("\\s+");
		for (int i = 0; i < sentenceArray.length; i++) {
			StringBuffer buffer = new StringBuffer(sentenceArray[i]);
			outputWord = buffer.reverse();
			outputSentence.append(outputWord);
			outputSentence.append(space);
		}
		System.out.print(outputSentence);
		return outputSentence.toString();
	}


}
