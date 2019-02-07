package com.dp.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Test {

	public static void main(String[] args) {
		
		final Student student = new Student();	
		Enhancer enhancer = new Enhancer();
		// 1.设置父类
		enhancer.setSuperclass(student.getClass());
		// 2.设置回调
		enhancer.setCallback(new MethodInterceptor() {
			/*
		 *	 Object proxy ：代理对象
		 *	 Method method：目标方法
		 *	 Object[] args：方法参数
		 *	 MethodProxy methodProxy ： 方法代理
		 **/
		@Override
		public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
			// 可以在这里添加一系列的控制
			// 直接调用代理对象进行处理
			//	Object obj = methodProxy.invokeSuper(proxy, args);
			// 目标对象处理
			Object obj = method.invoke(student, args);
			// 也可以在这里添加一系列的控制
			return obj;
		}
	});
		
		Object object = enhancer.create();
		System.out.println(object.getClass().getSimpleName());
		
		Student proxy = (Student)object;
		proxy.liaoGirls();
	}
}
