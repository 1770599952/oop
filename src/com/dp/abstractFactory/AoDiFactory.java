package com.dp.abstractFactory;

import com.dp.simpleFactory.AoDi;
import com.dp.simpleFactory.Car;

public class AoDiFactory implements abstractCarFactory{
	
	public Car newCar(){		
		return new AoDi();
	}
}
