package com.oop.base.base;

public class FanXingTest {

	public static void main(String[] args) {
		new Fan().fun("1");
	}
}
class Fan<T>{
	
	// 首先你要明白的是泛型就是一个起限定的作用（为了安全）
	
	// 第一个T你可以等价为声明了一个T类型的类class Fan<T>
	// 第二个T代表返回类型为T
	// 第三T代表参数为T
	public  T fun(T t) {
		return t;
	}
	
}