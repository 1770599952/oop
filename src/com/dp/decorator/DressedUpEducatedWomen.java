package com.dp.decorator;

public class DressedUpEducatedWomen extends EducatedWomen {

	public DressedUpEducatedWomen(int beautyIndex, int iq, String name) {
		super(beautyIndex, iq, name);
	}

	@Override
	public int getBeautyIndex() {
		return super.getBeautyIndex() + 20;
	}
}
