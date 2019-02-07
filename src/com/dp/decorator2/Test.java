package com.dp.decorator2;

import com.dp.decorator.Women;

public class Test {
	public static void main(String[] args) {
		DressedUpWomen fenjie1 = new DressedUpWomen(new Women(50, 80, "凤姐"));
		System.out.println(fenjie1.getBeautyIndex());
		System.out.println(fenjie1.getIq());
		fenjie1.say();
		
		System.out.println("-------------------------------");
		
		Women fenjie2 = new EducatedWomen(fenjie1);
		System.out.println(fenjie2.getBeautyIndex());
		System.out.println(fenjie2.getIq());
		fenjie2.say();
		
		System.out.println("-------------------------------");
		PoliteWomen fenjie3 = new PoliteWomen(fenjie2);
		System.out.println(fenjie3.getBeautyIndex());
		System.out.println(fenjie3.getIq());
		fenjie3.say();
		
		
		System.out.println("-------------------------------");
		Women baby = new PoliteWomen(new EducatedWomen(new DressedUpWomen(new Women(90, 100, "baby"))));
		System.out.println(baby.getBeautyIndex());
		System.out.println(baby.getIq());
		baby.say();
		
		System.out.println("-------------------------------");
		Women women = new DressedUpWomen(new DressedUpWomen(new Women(50, 80, "凤姐")));
		System.out.println(women.getBeautyIndex());
		System.out.println(women.getIq());
		women.say();
	}
}
