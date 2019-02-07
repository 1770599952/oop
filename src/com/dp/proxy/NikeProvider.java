package com.dp.proxy;

// 提供者
public interface NikeProvider {

	// 提供鞋子
	public Shoes provideShoes(NikeCustomer customer);
}
