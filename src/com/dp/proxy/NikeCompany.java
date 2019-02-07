package com.dp.proxy;

import com.dp.proxy.Currency.CurrencyType;

public class NikeCompany implements NikeProvider {

	// 耐克公司生产鞋子的基准价格
	private final double standardUsPrice = 100.0;
	
	public Shoes provideShoes(NikeCustomer customer) {
		return new Shoes("new balances", new Currency(CurrencyType.USD, customer.getDiscount() * standardUsPrice));
	}

}
