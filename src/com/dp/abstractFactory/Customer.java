package com.dp.abstractFactory;

import com.dp.simpleFactory.Car;

public class Customer {

	private Car car = null;
	
	public void buyCar(SSSS ssss){
		car = ssss.sellCar();
	}
	
	public void drive() {
		car.run();
	}
	
}
