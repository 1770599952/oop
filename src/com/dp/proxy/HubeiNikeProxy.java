package com.dp.proxy;

import com.dp.proxy.NikeRetailCustomer.Location;

public class HubeiNikeProxy implements NikeCustomer,NikeProvider{

	private ChinaNikeProxy chinaNikeProxy;
	
	public HubeiNikeProxy(ChinaNikeProxy chinaNikeProxy) {
		super();
		this.chinaNikeProxy = chinaNikeProxy;
	}

	public Shoes provideShoes(NikeCustomer customer) {
		
		if(!(customer instanceof NikeRetailCustomer)) {
			throw new RuntimeException("不是终端客户！");
		}
		NikeRetailCustomer customer2 = (NikeRetailCustomer) customer;
		Shoes shoes = chinaNikeProxy.provideShoes(this);
		Currency price = shoes.getPrice();
		Location location = customer2.getLocation();
		if(location != Location.HUBEI) {
			price.setValue(price.getValue() * customer2.getDiscount() + 100.0);	
		}else {
			price.setValue(price.getValue() * customer2.getDiscount() + 50.0);	
		}
		return shoes;
	}

	public double getDiscount() {
		return 1.0;
	}

	public ChinaNikeProxy getChinaNikeProxy() {
		return chinaNikeProxy;
	}

	public void setChinaNikeProxy(ChinaNikeProxy chinaNikeProxy) {
		this.chinaNikeProxy = chinaNikeProxy;
	}
	

}
