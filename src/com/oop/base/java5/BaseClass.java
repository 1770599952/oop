package com.oop.base.java5;

/**
 * 基础接口实现类。
 */
public class BaseClass implements BaseInterface {

    /**
     *  实现basefun方法时，添加 @Override 注解的意义
     */
    @Override
    public void basefun() {
        System.out.println("basefun 方法执行了！");
    }
}
