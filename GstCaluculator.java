package com.Xworkz.ControlStatement;

public class GstCaluculator {
	public static void main(String[] args){
		int price=30000;
		String typeofindustry="manufacture";
		double taxAmount;
		if(typeofindustry == "edu") {
		taxAmount=price*0.5/100;
		System.out.println(" Tax amount i s" +taxAmount);
	}else if(typeofindustry == "sales") {
		taxAmount=price*0.8/100;
		System.out.println(" Tax amount is " +taxAmount);
	}else if(typeofindustry == "health") {
		taxAmount=price*0.12/100;
		System.out.println(" Tax amount is " +taxAmount);
	}else if(typeofindustry == "manufacture") {
		taxAmount=price*0.15/100;
		System.out.println(" Tax amount is " +taxAmount);
	}
}
}
