package com.oop.base.base;

public class Finaltest {

	private static final int i = 9;
	private static String str = "abc";
	private final static String str1 = "ccc";
	private static final char[] array = {'1'};

	public static void main(String[] args) {
		System.out.println(""+i+"");
		str = "bbb";
		System.out.println(str);
		array[0] = '2';
	//	str1 = "ttt";
		System.out.println(array[0]);
				
	}
		
}
