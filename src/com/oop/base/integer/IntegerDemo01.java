package com.oop.base.integer;

public class IntegerDemo01 {

	public static void main(String[] args) {
		
		// 执行操作： Integer i01 =Integer.valueOf(59);
		// 而在valueOf的源代码中，
//	    public static Integer valueOf(int i) {
//	        if (i >= IntegerCache.low && i <= IntegerCache.high)
//	            return IntegerCache.cache[i + (-IntegerCache.low)];
//	        return new Integer(i);
//	    }
		// 因为在虚拟机启动的时候会加载常用的int类型的数据-128 -- 127.存储在IntegerCache中
		// 所以这里的i01直接指向虚拟机启动时加载此数字的内存。
		Integer i01 = 59;
		int i02 = 59;						// 存放在栈中。
		Integer i03 =Integer.valueOf(59);
		Integer i04 = new Integer(59);		// 直接在堆中新创建了一个对象。
		
		System.out.println(i01== i02);		// 这里会将i01拆箱，所以比较的是数值。
		System.out.println(i01== i03);
		System.out.println(i03== i04);
		System.out.println(i02== i04);
		System.out.println(i02== i04);
		
		
	}
}
