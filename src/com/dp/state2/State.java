package com.dp.state2;

public interface State {

	// 当前状态的行为表现。
	public abstract void perform();
	
	// 切换到下一个状态。
	public abstract State nextState();
}
