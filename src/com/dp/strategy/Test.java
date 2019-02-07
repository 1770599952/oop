package com.dp.strategy;

public class Test {
	
	public static void main(String[] args) {
		
		CDPlayer player = new CDPlayer();
		player.setCd(new LinCD());
		player.singCd();
	}
	
}
