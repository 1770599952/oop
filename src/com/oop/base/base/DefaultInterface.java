package com.oop.base.base;

public interface DefaultInterface {

	default void method() {
		System.out.println("default修饰");
	}
}
