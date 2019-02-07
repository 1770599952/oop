package com.dp.decorator;

public class Test1 {

	public static void main(String[] args) {
		Women fenjie = new Women(50, 80, "凤姐");
		System.out.println(fenjie.getBeautyIndex());
		System.out.println(fenjie.getIq());
		fenjie.say();
		System.out.println("-------------------------");
		Women baby = new Women(90, 100, "baby");
		System.out.println(baby.getBeautyIndex());
		System.out.println(baby.getIq());
		baby.say();
	}

}
