package com.dp.strategy;

public class CDPlayer {

	private CD cd;

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}
	
	public void singCd() {
		cd.sing();
	}
}
