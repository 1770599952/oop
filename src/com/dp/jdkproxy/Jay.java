package com.dp.jdkproxy;

public class Jay implements Language,Person{

	@Override
	public void work() {
		System.out.println(this);
		sayLanguage();
		System.out.println("My name is jay,I am an actor!");
	}

	@Override
	public int getAge() {
		return 32;
	}

	@Override
	public void sayLanguage() {
		System.out.println("我是是中国人，我会说汉语！");
	}

}
