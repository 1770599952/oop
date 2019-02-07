package com.dp.decorator;

public class Test2 {

	public static void main(String[] args) {
//		DressedUpWomen fenjie = new DressedUpWomen(50, 80, "凤姐");
//		System.out.println(fenjie.getBeautyIndex());
//		System.out.println(fenjie.getIq());
//		fenjie.say();
		
//		EducatedWomen fenjie = new EducatedWomen(50, 80, "凤姐");
//		System.out.println(fenjie.getBeautyIndex());
//		System.out.println(fenjie.getIq());
//		fenjie.say();
		
//		PoliteWomen fenjie = new PoliteWomen(50, 80, "凤姐");
//		System.out.println(fenjie.getBeautyIndex());
//		System.out.println(fenjie.getIq());
//		fenjie.say();
		
		
		DressedUpEducatedWomen fenjie = new DressedUpEducatedWomen(50, 80, "凤姐");
		System.out.println(fenjie.getBeautyIndex());
		System.out.println(fenjie.getIq());
		fenjie.say();
	}

}
