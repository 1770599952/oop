package com.dp.decorator2;

import com.dp.decorator.Women;

public class PoliteWomen extends WrapperWomen {
	public PoliteWomen(Women women) {
		super(women);
	}
	
	@Override
	public void say() {
		System.out.println("大家好！");
		super.say();
		System.out.println("请大家多多关照！");
	}
}
