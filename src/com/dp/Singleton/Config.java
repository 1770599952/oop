package com.dp.Singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Config {

    // 持有一个对本对象的引用
    private static volatile Config config = null;
    private Properties pro = null;

    // 即时加载
//	static {
//		try {
//			config = new Config();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
    //
    public static Config getInstance() {
        return config;
    }

    private Config() {
        // 按需加载
        if (null == config) {
            synchronized (Config.class) {
                if (null == config) {
                    config = new Config();
                }
            }
        }

        pro = new Properties();
        InputStream in = Config.class.getClassLoader().getResourceAsStream(
                "single.properties");
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
