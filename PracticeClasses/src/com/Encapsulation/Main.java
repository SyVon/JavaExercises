package com.Encapsulation;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		player.name = "Syrus";
		player.health = 100;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining Health: " + player.healthRemaining());

	}

}
