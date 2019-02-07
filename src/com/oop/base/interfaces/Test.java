package com.oop.base.interfaces;

public class Test {

	public static void main(String[] args) {
		
//		HttpSession session = new StandardSession();
		HttpSession session = new HttpSession() {
			
			@Override
			public String getAttribute(String name) {
				return name;
			}
		};
		System.out.println(setCategoreName(session));
	}
	
	public static String setCategoreName(HttpSession session) {
		String value = session.getAttribute("name");
		return value;
	}
}
