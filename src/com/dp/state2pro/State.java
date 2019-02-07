package com.dp.state2pro;

public enum State {

	TEEN {
		@Override
		public void perform() {
			System.out.println("我是小孩子，我喜欢玩！");
		}

		@Override
		public State nextState() {
			return State.YOUTH;
		}
	},YOUTH {
		@Override
		public void perform() {
			System.out.println("我是青年人，我需要努力学习！");
		}

		@Override
		public State nextState() {
			return OLD;
		}
	},OLD {
		@Override
		public void perform() {
			System.out.println("我是老年人，我需要安享晚年！");	
		}

		@Override
		public State nextState() {
			return TEEN;
		}
	};
	
	public abstract void perform();
	
	public abstract State nextState();
}
