package com.oop.base.base;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[] {1,1,1};
		// 构造函数是将包含BigInteger的二进制补码表示形式的byte数组转换为BigInteger
		BigInteger itr = new BigInteger(1, bytes);
		System.out.println(itr.intValue());
	}
}
