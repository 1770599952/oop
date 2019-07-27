package com.dp.Singleton;

public class Config1 {
    private static volatile Config1 config = null;
    public static Config1 getInstance() {
        return config;
    }

    private Config1() {
        if (null == config) {
            synchronized (Config1.class) {
                if (null == config) {
                    config = new Config1();
                }
            }
        }
    }
}
