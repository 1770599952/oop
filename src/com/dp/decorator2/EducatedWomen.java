package com.dp.decorator2;

import com.dp.decorator.Women;

public class EducatedWomen extends WrapperWomen {

	public EducatedWomen(Women women) {
		super(women);
	}

	
	@Override
	public int getIq() {
		return super.getIq() + 20;
	}
	
}
