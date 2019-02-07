package com.dp.factoryMethod;

import com.dp.simpleFactory.AoDi;
import com.dp.simpleFactory.Car;

public class AodiSsss extends SSSS{

	public Car getCar() {
		return new AoDi();
	}

}
