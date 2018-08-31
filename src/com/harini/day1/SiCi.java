package com.harini.day1;

public class SiCi {
	private double principleAmount;
	private double rateOfInterest;
	private int timeInYears;

	public SiCi(double principleAmount, double rateOfInterest, int timeInYears) {
		this.principleAmount = principleAmount;
		this.rateOfInterest = rateOfInterest;
		this.timeInYears = timeInYears;
	}
	
	public double simpleInterest() {
		double simpleInterest = (principleAmount * rateOfInterest * timeInYears) / 100;
		return simpleInterest;
	}
	
	public double compoundInterest() {
		double ans1 = 1 + (rateOfInterest / 100);
		double compoundInterest = Math.pow(ans1, timeInYears);
		compoundInterest *=  principleAmount;
		return compoundInterest;
	}

}
