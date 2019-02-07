package com.dp.aopcglib;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor{

	private static ProxyConfig proxyConf = ProxyConfig.getInstance();
	private static Map<String,String> confMap;
	{
		confMap = new HashMap<String,String>();
		String proxyRulesStr = proxyConf.getProperty("proxyRules");
		if(null != proxyRulesStr) {
			String[] proxyRules = proxyRulesStr.split(",");
			for (String proxyRule : proxyRules) {
				String[] rule = proxyRule.split(":");
				confMap.put(rule[0], rule[1]);
			} 
		}

	}
	
	private Object object;
	
	public MyMethodInterceptor(Object object) {
		super();
		this.object = object;
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
	
		String realObjClassName = object.getClass().getName();
		String methodName = method.getName();
		String key = realObjClassName + "-" + methodName;
		String value = confMap.get(key);
		
		if(value == null) {
			value = confMap.get(realObjClassName + "-*");
			if(null == value) {
				return methodProxy.invoke(proxy, args);
			}
		}
		
		if(value.equals(Canst.BEFORE)) {
			System.out.println("AOP ----- BEFORE");
			return method.invoke(object, args);				// 调用真实对象直接进行方法调用
		//	return methodProxy.invokeSuper(proxy, args);	// 调用代理对象直接进行方法调用
		}
		
		if(value.equals(Canst.AFTER)) {
			Object obj = method.invoke(object, args);
			System.out.println("AOP ----- AFTER");
			return obj;
		}
		return method.invoke(object, args);
	}

}
