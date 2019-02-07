package com.dp.abstractFactory;

import com.dp.simpleFactory.Benchi;
import com.dp.simpleFactory.Car;

public class BenchiFactory implements abstractCarFactory{

	public Car newCar(){
		return new Benchi();
	}
}
