package com.dp.decorator;

public class PoliteWomen extends Women {

	public PoliteWomen(int beautyIndex, int iq, String name) {
		super(beautyIndex, iq, name);
	}

	@Override
	public void say() {
		System.out.println("大家好！");
		super.say();
		System.out.println("请大家多多关照！");
	}
}
