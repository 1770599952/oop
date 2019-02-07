package com.dp.state2;

public class OldState implements State{

	public void perform() {
		System.out.println("我死老年人，我要开始享受生活了！");
	}

	public State nextState() {
		return new TeenState();
	}

}
