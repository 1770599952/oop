package com.dp.simpleFactoryPlus;

public abstract class Car {

	private String brand;	// 品牌
	private String source;	// 产地
	
	private Car(){}
	
	public abstract void run();
	
	public static Car getInstance(){
		return new AodiCar();
	}	
	
	private static class AodiCar extends Car{

		public void run() {
			System.out.println("奥迪汽车在路上跑！");
		}
		
	} 
	
	private static class BentianCar extends Car{

		public void run() {
			System.out.println("奔驰汽车在路上跑！");
		}
		
	}
	
}
