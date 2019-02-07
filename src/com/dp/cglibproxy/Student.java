package com.dp.cglibproxy;

public class Student {

	public void study() {
		System.out.println("我是好学生，学习使我快乐！");
	}
	
	public void liaoGirls() {
		System.out.println("学习结束，我要去撩妹了！");
		System.out.println(this.getClass().getSimpleName());
	}
}
