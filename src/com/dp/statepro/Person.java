package com.dp.statepro;

import java.util.HashMap;
import java.util.Map;


// 状态模式PRO
public class Person {
	
	// 人天生具有多种心情
	Map<String, Mood> moods = new HashMap<String, Mood>();
	
	// 人当前时刻的心情
	private Mood currentMood;
	
	// 添加心情,我们不希望暴露内部的数据结构
	public boolean addMood(String moodName, Mood mood) {

		if (null != moods.put(moodName, mood)) {
			return true;
		}
		return false;
	}
	
	// 人在不同的心情下会有不同的状态。
	public void perform() {
		currentMood = moods.get(getMoodName());
		if(null == currentMood) {
			currentMood = moods.get("default");
		}
		// 线程安全问题的解决
		Mood currentMood_ = currentMood;
		currentMood_.perform();
	}
	
	// 获取心情标志Key
	public String getMoodName() {
		Config config = Config.getInstance();
		String moodName = config.getProperty("moodName");
		return moodName;
	}
}
