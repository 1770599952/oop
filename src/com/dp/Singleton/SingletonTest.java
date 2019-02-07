package com.dp.Singleton;

import java.net.URL;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Config config = Config.getInstance();
		
		String username = config.getProperty("name");
		
		System.out.println(username);
		URL url = SingletonTest.class.getClassLoader().getResource("single.properties");
		System.out.println(url);
	}
}
