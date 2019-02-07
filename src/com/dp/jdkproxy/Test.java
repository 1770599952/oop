package com.dp.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// jdk动态生成字节码。
public class Test {
	public static void main(String[] args) {
		// 1.要生成对象的接口
		Class<?>[] interfaces = new Class<?>[] {Language.class,Person.class};
		// 2.根据接口生成对象
		Object obj = Proxy.newProxyInstance(Test.class.getClassLoader(), interfaces,new MyInvocationHandler());
		Person person = (Person)obj;
		System.out.println(person.getClass().getSimpleName());
		person.work();
	}

}
class MyInvocationHandler implements InvocationHandler{

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(proxy.getClass());
		String methodName = method.getName();
		switch (methodName) {
		case "sayLanguage":
			System.out.println("我是中国人，我说汉语！");
			return null;
		case "work":
			System.out.println("我是老板的好员工，我会好好工作！");
			return null;
		case "getAge":
			System.out.println("我是老板的好员工，我会好好工作！");
			return 23;
		default:
			break;
		}
		return null;
	}
	
	
}