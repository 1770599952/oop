package com.dp.proxy;

// 货币类代码
public class Currency {

	// 货币类型枚举
	public static enum CurrencyType{
		RMB,USD,YEN;
	}
	
	/*比如类型:RMB 价格:50*/
	private CurrencyType type;
	private double value;
	
	public Currency(CurrencyType type, double value) {
		super();
		this.type = type;
		this.value = value;
	}
	public CurrencyType getType() {
		return type;
	}
	public void setType(CurrencyType type) {
		this.type = type;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}	
	
}
