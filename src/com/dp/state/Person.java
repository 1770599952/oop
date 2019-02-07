package com.dp.state;

// 状态模式类型一
public class Person {
	
	// 人的心情都是内在的，而不是外界临时赋予我们的，
	// 这里要表达的一个观点是，我们在代码中可以添加多种状态，可以在不同的时刻随时切换
	
	// 人的心情与人是紧密耦合的不可分离
	private Mood mood;

	public Mood getMood() {
		return mood;
	}

	public void setMood(Mood mood) {
		this.mood = mood;
	}

	// 人在不同的心情下会有不同的状态。
	public void perform() {
		mood.perform();
	}
}
