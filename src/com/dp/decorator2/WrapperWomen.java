package com.dp.decorator2;

import com.dp.decorator.Women;

public abstract class WrapperWomen extends Women {
	
	//持有需要被装饰的women对象
	private Women women;
	
	public WrapperWomen(Women women) {
		super(women.getBeautyIndex(), women.getIq(), women.getName());
		this.women = women;
	}
	
	@Override
	public int getBeautyIndex() {
		return women.getBeautyIndex();
	}
	
	@Override
	public int getIq() {
		return women.getIq();
	}
	
	@Override
	public String getName() {
		return women.getName();
	}
	
	@Override
	public void say() {
		women.say();
	}
}
