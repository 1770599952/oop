package com.dp.factoryMethod;

import com.dp.simpleFactory.Car;

public abstract class SSSS {

	public Car sellCar(){
		return getCar();
	}

	public abstract Car getCar();

}
