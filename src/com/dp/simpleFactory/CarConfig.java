package com.dp.simpleFactory;

import java.io.IOException;
import java.util.Properties;
public class CarConfig {
	
	private static CarConfig carConfig;
	private Properties pro;
	
	static{
		carConfig = new CarConfig();
	}
	
	public static CarConfig getInstance(){
		return carConfig;
	}
	
	private CarConfig() {
		pro = new Properties();
		try {
			pro.load(CarConfig.class.getResourceAsStream("car.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getCarBrand(){
		return pro.getProperty("car");
	}
}
