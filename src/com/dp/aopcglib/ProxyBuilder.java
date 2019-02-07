package com.dp.aopcglib;

import net.sf.cglib.proxy.Enhancer;

public class ProxyBuilder {

	private Enhancer enhancer = new Enhancer();
	public ProxyBuilder setRealObj(Object obj) {
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new MyMethodInterceptor(obj));
		return this;
	}
	
	public Object buildProxy() {
		return enhancer.create();
	}
}
