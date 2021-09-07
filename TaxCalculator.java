package com.Xworkz.ControlStatement;

public class TaxCalculator {
	public static void main(String[] args){
		int annualIncome = 500000;
		double taxAmount;
		if (annualIncome >= 200000){
		taxAmount = annualIncome*0.8/100;
		System.out.println(" The tax amount for " +annualIncome+ " is " +taxAmount);
		}else {
			System.out.println("Not elegible for tax");
		}
	}
}
