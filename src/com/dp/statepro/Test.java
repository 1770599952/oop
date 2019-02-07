package com.dp.statepro;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();		
		person.addMood("HappyMood", new HappyMood());
		person.perform();
	}
}
