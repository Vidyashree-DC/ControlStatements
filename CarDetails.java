package com.Xworkz.ControlStatement;

public class CarDetails {
	public static void main(String[] args){
		String CompanyName="MG-Hector";
		switch(CompanyName) {
		case "i20" :
			System.out.println("Engine Capacity : 1237 - 1347 cc");
			System.out.println("Milage : 20 - 22 KMPL");
			System.out.println("Price :12 Lakh");
			
			break;
		case "MG-Hector" :
			System.out.println("Engine Capacity : 800 - 1091 cc");
			System.out.println("Milage : 22 - 24.6 KMPL");
			System.out.println("Price :20.5 Lakh");
			break;
		case "KIA" :
			System.out.println("Engine Capacity : 950 - 1250 cc");
			System.out.println("Milage : 15.6 - 19.8");
			System.out.println("Price :15 Lakh");
			break;
		case "Mahindra" :
			System.out.println("Engine Capacity : 1560 - 1820 cc");
			System.out.println("Milage : 15 - 17");
			System.out.println("Price :14 Lakh");
			break;
			default : System.out.println("Invalid Car name");
			
		}
	}
}
