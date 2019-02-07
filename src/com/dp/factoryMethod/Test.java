package com.dp.factoryMethod;


public class Test {

	public static void main(String[] args) {

		SSSS ssss = new BeichiSsss();
		Customer customer = new Customer();
		customer.buyCar(ssss);
		customer.drive();
	}

}
