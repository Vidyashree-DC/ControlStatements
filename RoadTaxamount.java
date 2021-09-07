package com.Xworkz.ControlStatement;

public class RoadTaxamount {
	public static void main(String[] args){
	String state="KA";
	if(state == "KA") {
	System.out.println("roadtaxamount for karnataka state vehicles is : 2000 RS");
}else if(state == "TN") {
System.out.println("roadtaxamount for TamilNadu state vehicles is : 5000 RS");
}else if(state == "KE") {
System.out.println("roadtaxamount for Kerala state vehicles is : 2500 RS");
}
else if(state == "AP") {
System.out.println("roadtaxamount for Maharastra state vehicles is : 3000 RS");
}
else {
	System.out.println("Invalid State name");
}
}
}
