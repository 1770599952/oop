package com.dp.abstractFactory;

import com.dp.simpleFactory.Car;
// 抽象工厂设计模式
public interface abstractCarFactory {
	public Car newCar();
}
