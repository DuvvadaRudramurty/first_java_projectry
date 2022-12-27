package com.java.test;

public class SimpleinterestCalculation {

	public static void main(String[] args) {
		float rateOfInterest=7.8f;
		double amount=34000;
		int year = 5;
		
		
		double interestAmount=(amount*year*rateOfInterest)/100;
		
		System.out.println("Interest Amount =" + interestAmount);

	}

}
