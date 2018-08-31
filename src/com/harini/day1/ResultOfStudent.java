package com.harini.day1;

public class ResultOfStudent {
	public static String checkResult(int mathsScore, int physicsScore, int chemistryScore) {
		if(mathsScore >= 60 && physicsScore >= 60 && chemistryScore >= 60) {
			System.out.println("Passed");
			return "Passed";
		} else if(mathsScore >= 60 && physicsScore >= 60 ||mathsScore >= 60 && chemistryScore >= 60 || chemistryScore >= 60 && physicsScore >= 60) {
			System.out.println("Promoted");
			return "Promoted";
		} else {
			System.out.println("Failed");
			return "Failed";
		}
	}

}
