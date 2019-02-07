package com.dp.state;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		// 人的心情应该是自动变换的，而不应该手动切换
		// 我们在这里要表明的一个问题时，心情的自动切换，定时框架
		person.setMood(new HappyMood());
		person.perform();
	}
}
