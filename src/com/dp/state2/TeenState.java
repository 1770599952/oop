package com.dp.state2;

public class TeenState implements State{

	public void perform() {
		System.out.println("我是小学生，我比较喜欢玩！");
	}

	public State nextState() {
		return new YouthState();
	}

}
