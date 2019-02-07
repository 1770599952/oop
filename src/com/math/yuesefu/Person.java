package com.math.yuesefu;
// 玩家类
public class Person {

	private int index;

	private Person leftPerson;

	private Person rightPerson;
	
	// 叫号
	public void callNum(int num,Rule rule) {
		
		if(this.leftPerson == this && this == this.rightPerson) {
			System.out.println("我是最后一个人:"+this.index);
			return ;
		}
		
		if(num == rule.getMaxNumber()){
			num = 1;
			this.leave();
		}else{
			num++;
		}
		rightPerson.callNum(num,rule);
	}

	// 离开
	private void leave() {
		
		this.leftPerson.rightPerson = this.rightPerson;
		this.rightPerson.leftPerson = this.leftPerson;
		System.out.println("当前出队人序号"+this.index);
		
		return;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Person getLeftPerson() {
		return leftPerson;
	}

	public void setLeftPerson(Person leftPerson) {
		this.leftPerson = leftPerson;
	}

	public Person getRightPerson() {
		return rightPerson;
	}

	public void setRightPerson(Person rightPerson) {
		this.rightPerson = rightPerson;
	}

}
