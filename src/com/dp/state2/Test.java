package com.dp.state2;

public class Test {

	// 每一个人再不同的阶段会有不同的表现状态，
	// 而且这里我们认为在一个状态表现完了以后就应该执行下一个状态,
	// 执行到最后一个状态以后就会返回第一个状态。
	// 本质而言就是一个循环的表现案例。
	// 以下是第一种方式：
	// 这一种模式有什么缺点呢？
	// 我们每次执行nextState方法时，都会返回一个新的对象，执行完被回收，下次继续重复这个过程，比较浪费资源。
	// 我们接下来会采用枚举进行改进。
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setState(new TeenState());
		person.perform();
		person.perform();
	}
}
