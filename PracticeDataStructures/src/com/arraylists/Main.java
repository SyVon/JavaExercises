package com.arraylists;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		
		while(!quit) {
			printInstructions();
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					System.out.println("Enter Item Number: ");
					int itemNo = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter Replacement Item: ");
					String item = scanner.nextLine();
					groceryList.modifyGroceryItem(itemNo, item);
					scanner.nextLine();
				case 4:
					groceryList.removeGroceryItem(scanner.nextInt());
					scanner.nextLine();
				case 5:
					groceryList.findItem(scanner.nextLine());
				case 6:
					quit = true;
					break;
			}
		}

	}
	
	private static void printInstructions() {
		System.out.println("0 - Print choice options");
		System.out.println("1 - Print grocery list");
		System.out.println("2 - Add item to grocery list");
		System.out.println("3 - ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void addItem() {
		groceryList.addGroceryItem(scanner.nextLine());
	}
	
	

}
