package com.Composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540,1440));
		
		Motherboard theMotherboard = new Motherboard("12-bt", "ASUS", 4,6,"v2.44");
		
		PC newPC = new PC(theCase, theMonitor, theMotherboard);
		
		newPC.powerUp();
		
	}
	

}
