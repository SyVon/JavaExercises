package com.Encapsulation;

public class Printer {
	private int tonerLevel = 100;
	private int pagesPrinted;
	private boolean isDuplex;
	
	public Printer(boolean isDuplex) {
		this.isDuplex = isDuplex;
	}
	
	public void fillToner(int tonerAmount) {
		int toner = tonerAmount + this.tonerLevel;
		if(toner < 100) {
			this.tonerLevel = toner;
		}
	}
	
	public void printPage() {
		this.pagesPrinted += 1;
		if(isDuplex) {
			System.out.println("Printing a duplex page...");
		}
	}
	
	
}
