 package com.dp.proxy;

import com.dp.proxy.Currency.CurrencyType;

public class ChinaNikeProxy implements NikeProvider, NikeCustomer {

	private NikeCompany nikeCompany;
	private double discount;
	
	public ChinaNikeProxy(NikeCompany nikeCompany, double discount) {
		super();
		this.nikeCompany = nikeCompany;
		this.discount = discount;
	}

	// 获取折扣率
	public double getDiscount() {
		return discount;
	}

	// 提供鞋子
	public Shoes  provideShoes(NikeCustomer customer) {
		Shoes shoes = nikeCompany.provideShoes(this);
		shoes.setName("new balances 574!");
		Currency price = shoes.getPrice();
		double usPrice = price.getValue();
		double rmbPrice = getRmbPrice(usPrice) * customer.getDiscount();
		price.setType(CurrencyType.RMB);
		price.setValue(rmbPrice);
		return shoes;
	}

	// 转换为人民币价格
	private double getRmbPrice(double usPrice) {
		return usPrice*Rate.getRMBRate();
	}

	public NikeCompany getNikeCompany() {
		return nikeCompany;
	}

	public void setNikeCompany(NikeCompany nikeCompany) {
		this.nikeCompany = nikeCompany;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}	

}
