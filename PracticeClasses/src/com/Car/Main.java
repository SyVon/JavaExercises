/**
 * 
 */
package com.Car;

/**
 * @author svon
 *
 */
public class Main {

	public static void main(String[] args) {
		Car porsche = new Car();
		porsche.setEngine("v6");
		System.out.println(porsche.getEngine());
		String test = porsche.getEngine();
		System.out.println(test);
		test = "talsjegh";
		System.out.println(porsche.getEngine()); 

	}

}
