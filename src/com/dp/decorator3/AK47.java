package com.dp.decorator3;

public class AK47 implements Gun {

	@Override
	public void aim() {
		System.out.println("------ak47瞄准中...----------------");
	}

	@Override
	public void shoot() {
		System.out.println("------ak47开枪！！！----------------");
	}

	@Override
	public void load() {
		System.out.println("------ak47装满子弹了，要小心了哦！----------------");
	}

	@Override
	public void unload() {
		System.out.println("------ak47卸掉子弹了，放心啦！----------------");
	}

}
