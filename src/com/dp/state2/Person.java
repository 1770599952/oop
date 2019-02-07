package com.dp.state2;

public class Person {

	private State state = null;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void perform() {
		state.perform();	// 执行当前状态的行为表现
		state = state.nextState();	// 切换到下一个状态
	}
}
