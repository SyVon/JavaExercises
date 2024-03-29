/**
 * 
 */
package com.animal;

/**
 * @author svon
 *
 */
public class Animal {
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Animal.eat() called");
	}
	
	public void move(int speed) {
		System.out.println("Animal is moving at " + speed);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the brain
	 */
	public int getBrain() {
		return brain;
	}

	/**
	 * @param brain the brain to set
	 */
	public void setBrain(int brain) {
		this.brain = brain;
	}

	/**
	 * @return the body
	 */
	public int getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(int body) {
		this.body = body;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
}
