package com.dp.decorator2;

import com.dp.decorator.Women;

public class DressedUpWomen extends WrapperWomen {
	
	public DressedUpWomen(Women women) {
		super(women);
	}

	@Override
	public int getBeautyIndex() {
		return super.getBeautyIndex() + 20;
	}

}
