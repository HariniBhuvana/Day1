package com.harini.day1;

public class CorrectionSentences {
	public static String correctionSentence(String sentence, int positionToRemoves) {
		StringBuffer sentenceBuffer = new StringBuffer();
		StringBuffer space = new StringBuffer(" ");
		String[] sent = sentence.split("\\s+");
		for (int i = 0; i < sent.length; i++) {
			if (i == positionToRemoves - 1) {
				continue;
			}
			StringBuffer wordBuffer = new StringBuffer(sent[i]);
			sentenceBuffer.append(wordBuffer);
			sentenceBuffer.append(space);
		}
		System.out.println(sentenceBuffer.toString());
		return sentenceBuffer.toString();

	}

}
