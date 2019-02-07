package com.dp.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// jdk动态代理！
// 被代理的对象和代理对象必须有完全一致的接口。
public class Test1 {

	public static void main(String[] args) {

		Jay jay = new Jay();
		Object obj = Proxy.newProxyInstance(jay.getClass().getClassLoader(), jay.getClass().getInterfaces(),new JayInvocationHandler(jay));	
		System.out.println(obj instanceof Jay);
		Person person = (Person)obj;
		System.out.println(obj instanceof Jay);
		System.out.println(person.getClass().getSimpleName());

		person.work();
	}

}
class JayInvocationHandler implements InvocationHandler{
	private Jay jay;
	
	public JayInvocationHandler(Jay jay) {
		super();
		this.jay = jay;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		JoinPoint joinPoint = new JoinPoint();
		// 反射调用目标对象
		Object obj = method.invoke(jay, args);
		// 执行controller method.invoke(controller,args);
		return null;
	}

	static class JoinPoint{
		private Method method;
	}
}
