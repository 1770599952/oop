package com.oop.base.base;

public class B extends A {
	
	public B() {
		super();
		System.out.println("super i" + super.i);
		super.method();

	}

	int i = 1000;
	static int j = 2000;

	public void method() {
		System.out.println(this.i + " :B");
		return;
	}

	public static void main(String[] args) {
		System.out.println(new B().i);
	}
}
class A {

	public A() {
		this.method();
	}

	int i = 100;
	static int j = 200;

	public void method() {
		System.out.println(i + " :A");
		System.out.println(i + " static a");
		return;
	}
}
