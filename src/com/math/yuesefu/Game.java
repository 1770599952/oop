package com.math.yuesefu;

import java.util.Scanner;

public class Game {

	private Person[] person;
	private Rule rule = new Rule();
	private Person startPerson = new Person();
	
	public Game() {
		initRule();
		initPerson();
	}

	private void initRule() {		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("----游戏规则初始化----");
		System.out.println("请输入游戏人数：");
		int number = reader.nextInt();
		rule.setAllNumber(number);
		System.out.println("请输入开始的序号：");
		int startNumber = reader.nextInt();
		rule.setStartNumber(startNumber);
		System.out.println("请输入跳转序号：");
		int maxNumber = reader.nextInt();
		rule.setMaxNumber(maxNumber);
		System.out.println("----规则初始化结束----");
				
		reader.close();
	}
	
	private void initPerson() {

		person = new Person[rule.getAllNumber()];
		for(int i = 0;i < person.length;i++) {
			person[i] = new Person();
			person[i].setIndex(i + 1);
		}
		
		startPerson = person[rule.getStartNumber() -1 ];
		
		for(int i = 0;i < person.length;i++) {
			if(0 == i) {
				person[i].setLeftPerson(person[person.length-1]);
				person[i].setRightPerson(person[i+1]);
			} else if (person.length - 1 == i){
				person[i].setLeftPerson(person[i-1]);
				person[i].setRightPerson(person[0]);				
			}else{
				person[i].setLeftPerson(person[i-1]);
				person[i].setRightPerson(person[i+1]);
			}
		}
		
	}
	
	public void startGame() {
		System.out.println("----游戏开始----");
		startPerson.callNum(1, rule);
	}
	
}
