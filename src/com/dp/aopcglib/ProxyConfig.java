package com.dp.aopcglib;

import java.io.IOException;
import java.util.Properties;
public class ProxyConfig {
	
	private static ProxyConfig Config;
	private Properties pro;
	
	static{
		Config = new ProxyConfig();
	}
	
	public static ProxyConfig getInstance(){
		return Config;
	}
	
	private ProxyConfig() {
		pro = new Properties();
		try {
			pro.load(ProxyConfig.class.getResourceAsStream("aopconfig.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String name){
		return pro.getProperty(name);
	}
}
