package com.dp.factoryMethod;

import com.dp.simpleFactory.Benchi;
import com.dp.simpleFactory.Car;

public class BeichiSsss extends SSSS{

	public Car getCar() {
		return new Benchi();
	}
	
}
