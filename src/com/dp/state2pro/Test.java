package com.dp.state2pro;

public class Test {

	// 枚举版本，循环示例
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setState(State.TEEN);
		person.perform();
		person.perform();
	}
}
