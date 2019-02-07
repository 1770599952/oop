package com.dp.simpleFactory;
// 简单工厂设计模式
public class CarFactory {
	
	private static CarConfig carConfig;
	
	public static Car getCar(){
		carConfig = CarConfig.getInstance();
		String carClass = carConfig.getCarBrand();
		Class calzz = null;
		Car car = null;
		try {
			calzz = Class.forName(carClass);
			car = (Car) calzz.newInstance();	// 这里只能生成无参数的Car
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return car;
	}

}
