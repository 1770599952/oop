package com.oop.base.base;

import java.io.Serializable;
import java.util.Random;

public class A1 implements Serializable{

	private static final long serialVersionUID = 1L;
	public volatile  transient int i = 10;
	
	public A1(int i) {
		this.i = i;
	}

	protected synchronized void f() {
		System.out.println("aa");
		h();
	}

	private void h() {
		System.out.println("aah");
	}

	public int hashCode() {
		return new Random().nextInt();
	}

	public static void main(String[] args) {
		System.out.println(new A1(4) == new A1(4));
	}

	@Override
	public String toString() {
		return "A1 [i=" + i + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		A1 a1 = (A1) obj;
		
		return this.i == a1.i;
	}
	

}
