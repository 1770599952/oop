package com.oop.base.file;

import java.io.File;

public class ListFile {

	// 递归
	// 遍历该文件夹下反应文件，File folder ：进行遍历的文件夹
	public static void listFiles(File folder) {
		
		// 1.如果该文件夹不存在，直接返回
		if(!folder.exists()) {
			return ;
		}
		
		// 2.如果该文件夹是目录
		if(folder.isDirectory()) {
			// 遍历这个目录的所有文件（如果有经验，你会注意到，这就是递归）
			File[] file = folder.listFiles();
			if(null == file) {
				return ;
			}
			for (int i = 0; i < file.length; i++) {
				if(!file[i].exists()) {
					break;
				}
				listFiles(file[i]);				
			}
		}else {
			// 否则就是文件
			System.out.println(folder.getAbsolutePath() + folder.getName());
		}
	}
	
	public static void main(String[] args) {
		File folder = new File("C://");
		listFiles(folder);
	}
}

