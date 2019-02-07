package com.dp.decorator;

public class DressedUpWomen extends Women {

	public DressedUpWomen(int beautyIndex, int iq, String name) {
		super(beautyIndex, iq, name);
	}

	@Override
	public int getBeautyIndex() {
		return super.getBeautyIndex() + 20;
	}
	
}
