/**
 * 
 */
package com.Car;

/**
 * @author svon
 *
 */
public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	/**
	 * @return the doors
	 */
	public int getDoors() {
		return doors;
	}
	/**
	 * @param doors the doors to set
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}
	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}
	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	/**
	 * @return the model
	 */
	public String getModel() { //why is it okay to return a string object
		return model; 
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
