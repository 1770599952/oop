package com.oop.base.base;

public class StaticNeiBuLeiTest {

	private static int i = 0;
	private int j = 9;
	
	static class Inner{
		
		private static int x = 0;
		public void f() {
//			System.out.println(StaticNeiBuLeiTest.this);
			i = 1;
		}
	}
	
	public static void main(String[] args) {
	
			System.out.println(StaticNeiBuLeiTest.Inner.x);
			new Inner().f();
			System.out.println(i);
	}
}
