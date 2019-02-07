package com.oop.base.volitale;

public class VolatileStudy01 {

	volatile static Person person = new Person();
		
	public static void main(String[] args) {
		
		Thread thread01 = new Thread(new Runnable() {

			@Override
			public void run() {
				person.name = "liu";

				while(!person.name.equals("fang")) {}
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(person.name);
			}
		});
		thread01.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		person.name = "fang";
		System.out.println(person.name);
	}
	
}
class Person{
	public String name;
}