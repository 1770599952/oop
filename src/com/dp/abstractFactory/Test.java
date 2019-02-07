package com.dp.abstractFactory;

public class Test {

	public static void main(String[] args) {

		Customer customer = new Customer();

		abstractCarFactory factory = new BenchiFactory();

		SSSS ssss = new SSSS();
		ssss.setCarFactory(factory);

		customer.buyCar(ssss);

		customer.drive();
	}

}
