package com.arraylists;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("Size: " + groceryList.size());
		for( String i : groceryList) {
			System.out.println(i);
		}
	}
	
	public void modifyGroceryItem(int index, String item) {
		groceryList.set(index, item);
	}
	
	public void removeGroceryItem(int index) {
		groceryList.remove(index);
	}
	
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position >= 0) {
			return groceryList.get(position);
		}
		
		return null;
	}
	
	
}
