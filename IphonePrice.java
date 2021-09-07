package com.Xworkz.ControlStatement;

public class IphonePrice {
	public static void main(String[] args){
		String model = "iphone 6 plus";
		if (model == "iphone") {
			System.out.println("price of" + model + " is : 35000 Rs");
		} else if (model == "iphone 6 plus") {
			System.out.println("price of" + model + " is : 40000 Rs");
		} else if (model == "iphone 12 pro") {
			System.out.println("price of" + model + " is : 1200000 Rs");
		} else if (model == "iphone 11 ") {
			System.out.println("price of" + model + " is : 55999 Rs");
		} else {
			System.out.println("Invalid model name");
		}
	}
}
