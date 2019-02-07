package com.dp.decorator;

public class Women {

	private int beautyIndex;
	
	private int iq;
	
	private String name;
	
	public Women(int beautyIndex,int iq,String name) {
		this.beautyIndex = beautyIndex;
		this.iq = iq;
		this.name = name;
	}
	
	public int getBeautyIndex() {
		return beautyIndex;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIq() {
		return iq;
	}
	
	public void say(){
		System.out.println("我的名字叫" + name);
	}
	
}
