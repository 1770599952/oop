package com.dp.state2;

public class YouthState implements State{

	public void perform() {
		System.out.println("我是青年人，我需要好好学习！");
	}

	public State nextState() {
		return new OldState();
	}

}
