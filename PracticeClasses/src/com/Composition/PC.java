package com.Composition;

public class PC {

	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		this.theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		this.monitor.drawPixelAt(1200, 50, "yellow");
	}
	

}
