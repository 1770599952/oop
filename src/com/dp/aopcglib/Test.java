package com.dp.aopcglib;

public class Test {

	
	public static void main(String[] args) {

		Student student = new Student();
		ProxyBuilder builder = new ProxyBuilder();
		student =  (Student)builder.setRealObj(student).buildProxy();
		student.liaoGirls();
	//	System.out.println(student);
	}

}
