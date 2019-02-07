package com.oop.base.string;

public class StringDemo01 {

	private static final char[] i = {'1','2','4'};
	public static void main(String[] args) {
		i[1] = '3';
		System.out.println(i[1]);
		String str = String.valueOf("str");
		String str1 = "str";
		System.out.println(str1 == str);
	}
}
