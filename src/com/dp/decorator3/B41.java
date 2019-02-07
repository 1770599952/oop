package com.dp.decorator3;

public class B41 implements Gun {

	@Override
	public void aim() {
		System.out.println("------b41瞄准中...----------------");
	}

	@Override
	public void shoot() {
		System.out.println("------b41开枪！！！----------------");
	}

	@Override
	public void load() {
		System.out.println("------b41装满子弹了，要小心了哦！----------------");
	}

	@Override
	public void unload() {
		System.out.println("------b41卸掉子弹了，放心啦！----------------");
	}

}
