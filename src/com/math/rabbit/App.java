package com.math.rabbit;

public class App {

	public static void main(String[] args) {	
		RabbitHouse rabbitHouse = new RabbitHouse();
		int totalCounts = rabbitHouse.getTotalCounts(5);
		System.out.println("兔子的总数为:"+totalCounts);
	}
}
