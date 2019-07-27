package com.dp.simpleFactory;

public class TestCar {

	public static void main(String[] args) {
//
		Family family = new Family();
		family.goOut(CarFactory.getCar());


	}
}
