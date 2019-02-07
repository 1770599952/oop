package com.dp.decorator3;

public class SilentGun extends WrapperGun {

	public SilentGun(Gun gun) {
		super(gun);
	}
	

	@Override
	public void shoot() {
		super.shoot();
		System.out.println("--------加装了消声器，开枪声音分贝降低80%");
	}

}
