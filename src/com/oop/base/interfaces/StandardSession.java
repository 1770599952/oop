package com.oop.base.interfaces;

public class StandardSession implements HttpSession,Http{

	@Override
	public String getAttribute(String name) {
		return name;
	}

}
