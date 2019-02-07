package com.dp.simpleFactory;

public class Family {	
	
	public void goOut(Car car) {
		
		System.out.println("全家出行喽。");
		car.run();
	}
}
