package com.dp.abstractFactory;

import com.dp.simpleFactory.Car;

public class SSSS {

	private abstractCarFactory carFactory;

	public abstractCarFactory getCarFactory() {
		return carFactory;
	}

	public void setCarFactory(abstractCarFactory carFactory) {
		this.carFactory = carFactory;
	}
	
	public Car sellCar(){
		return carFactory.newCar();
	}
	
}
