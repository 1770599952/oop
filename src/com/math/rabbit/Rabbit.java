package com.math.rabbit;

public class Rabbit {

	private int birthMonth;
	private RabbitHouse rabbitHouse;
	
	public Rabbit(int birthMonth,RabbitHouse rabbitHouse) {
		this.birthMonth = birthMonth;
		this.rabbitHouse = rabbitHouse;
	}
	
	public void die(int currentMonth) {
		if(currentMonth - this.birthMonth == 5) {
			rabbitHouse.removeRabbit(this);
		}
		return ;
	}
	// 兔子生孩子
	public void getBody(int currentMonth) {
		if(currentMonth - this.birthMonth >= 2) {
			Rabbit body1 = new Rabbit(currentMonth, rabbitHouse);
			Rabbit body2 = new Rabbit(currentMonth, rabbitHouse);
			rabbitHouse.addRabbit(body1);
			rabbitHouse.addRabbit(body2);
		}
		return ;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public RabbitHouse getRabbitHouse() {
		return rabbitHouse;
	}
	public void setRabbitHouse(RabbitHouse rabbitHouse) {
		this.rabbitHouse = rabbitHouse;
	}
	
	
}
