package com.dp.decorator3;

public class MiaozhunGun extends WrapperGun {
	
	public MiaozhunGun(Gun gun) {
		super(gun);
	}
	
	@Override
	public void aim() {
		super.aim();
		System.out.println("--------增加了瞄准镜，射击精度将会提高50%-------------");
	}

}
