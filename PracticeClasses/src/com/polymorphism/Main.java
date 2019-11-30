package com.polymorphism;

import java.util.Objects;

class Car {
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	public Car(String name, int cylinders){
		this.cylinders = cylinders < 0 ? 1: cylinders;
		this.name = Objects.requireNonNull(name, "Unknown");
		this.wheels = 4;
		this.engine = true; 
	}

	public void startEngine() {
		System.out.println("You started your " + this.engine + " engine");
	}
	
	public void accelerate() {
		System.out.println("Car -> Accelerate");
	}
	
	public void brake() {
		System.out.println("Car -> Brake");
	}
	
	public String getName() {
		return name;
	}

	public boolean getEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}
	
}

class Corvette extends Car{


	public Corvette() {
		super("Corvette",6);
	}
	
	@Override
	public void accelerate() {
		System.out.println("Corvette -> Accelerate");
	}
	
	@Override
	public void brake() {
		System.out.println("Corvetter -> brake");
	}	
	
}


class Kia extends Car{


	public Kia() {
		super("Kia",6);
	}
	
	@Override
	public void accelerate() {
		System.out.println("Kia-> Accelerate");
	}
	
	@Override
	public void brake() {
		System.out.println("Kia -> brake");
	}	
	
}


class Subaru extends Car{


	public Subaru() {
		super("Subaru",6);
	}
	
	@Override
	public void accelerate() {
		System.out.println("Subaru -> Accelerate");
	}
	
	@Override
	public void brake() {
		System.out.println("Subaru -> brake");
	}	
	
}

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car("base car", 8);
		System.out.println(car.getName());
		car.accelerate();
		car.brake();
		
		Subaru subaru = new Subaru(); 
		subaru.accelerate();
	}
}
