package com.dp.statepro;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Config {

	private static Config config = null;
	private Properties pro = null;

	static {
		try {
			config = new Config();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Config() {
		
		pro = new Properties();
		InputStream in = Config.class.getClassLoader().getResourceAsStream(
				"mood.properties");
		try {
			pro.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Config getInstance() {
		return config;
	}

	public String getProperty(String str) {

		try {
			str = pro.getProperty(str);
			return str;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
