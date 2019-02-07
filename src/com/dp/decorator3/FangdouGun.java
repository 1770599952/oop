package com.dp.decorator3;

public class FangdouGun extends WrapperGun {

	public FangdouGun(Gun gun) {
		super(gun);
	}


	@Override
	public void shoot() {
		super.shoot();
		System.out.println("--------加装了防抖器，射击精度提高30%--------------");
	}
}
