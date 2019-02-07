package com.dp.proxy;

import com.dp.proxy.NikeRetailCustomer.Location;

// 静态代理
public class Test {

	public static void main(String[] args) {

		/*
		 * 	耐克公司如若要把耐克鞋销往中国，必须了解与中国相关的事情，业务法，法律，税务等一系列的事情，
		 * 	这样耐克公司就不能专心做自己的事情，所以我们生成了一个中国区总代理，负责全权打理售前售后的
		 *  事情，耐克公司只要负责提供鞋子。
		 * 
		 * 	代理模式与装饰者设计模式很像，但是语义不同，
		 * 	装饰者设计模式重点在于对象本身。装饰者设计模式持有的是接口，多态的使用。
		 *  而代理模式重点在于代理。而静态代理模式持有的是对象本身。代理对象必须与被代理对象实现相同的接口。
		 * */
		// 耐克公司
		NikeCompany company = new NikeCompany();
		// 中国区总代理
		ChinaNikeProxy chinaNikeProxy = new ChinaNikeProxy(company, 0.95);
		System.out.println(company.provideShoes(chinaNikeProxy));
		
		// 湖北区代理
		HubeiNikeProxy hubeiNikeProxy = new HubeiNikeProxy(chinaNikeProxy);
		System.out.println(chinaNikeProxy.provideShoes(hubeiNikeProxy));
		// 终端客户
		NikeRetailCustomer retailCustomer = new NikeRetailCustomer(Location.HUBEI, 1.0);
		System.out.println(hubeiNikeProxy.provideShoes(retailCustomer));

	}

}
