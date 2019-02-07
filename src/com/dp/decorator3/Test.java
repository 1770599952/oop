package com.dp.decorator3;

public class Test {

	public static void main(String[] args) {
		Gun gun = new AK47();
		Gun gun2 = new FangdouGun(gun);
		Gun gun3 = new MiaozhunGun(gun2);
		Gun gun4 = new SilentGun(gun3);
		
		gun4.aim();
		gun4.shoot();
				
		Gun gun5 = new FangdouGun(new MiaozhunGun(new SilentGun(new B41())));
		gun5.aim();
		gun5.shoot();
	}
}
