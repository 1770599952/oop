package com.dp.simpleFactoryPlus;

public class Test {

	public static void main(String[] args) {

		Car car = Car.getInstance();
		car.run();
	}

}
