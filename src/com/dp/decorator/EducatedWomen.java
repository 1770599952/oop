package com.dp.decorator;

public class EducatedWomen extends Women {

	public EducatedWomen(int beautyIndex, int iq, String name) {
		super(beautyIndex, iq, name);
	}

	
	@Override
	public int getIq() {
		return super.getIq() + 20;
	}
}
