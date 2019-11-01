package com.animal;

public class Fish extends Animal{

	private int gills;
	private int eyes;
	private int fins;
	
	
	
	public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
		super(name, brain, body, size, weight);
		
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	public void rest() {
		
	}
	
	public void swim() {
		System.out.println("called fish.swim()");
	}
	
	private void moveMuscles() {
		System.out.println("called fish.moveMuscles()");
	}
	
	private void moveBackFin() {
		
	}
	
	private void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
	
	
}
