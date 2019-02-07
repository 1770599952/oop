package com.oop.base.base;

public class NeiBuLeiTest {

	private static int i = 0;
	private int j = 1;

	static class Inner {

		public static int x = 0;

		public void f() {
//			System.out.println(NeiBuLeiTest.this);
			i = 1;
		}
	}

	public static void main(String[] args) {
//		new NeiBuLeiTest().new Inner().f();
//		System.out.println(i);
//		System.out.println(new NeiBuLeiTest().new Inner().x);
		System.out.println(NeiBuLeiTest.Inner.x);

		new NeiBuLeiTest.Inner().f();
	}
}
