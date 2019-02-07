package com.oop.base.java5;


/**
 * 基础接口
 */
public interface BaseInterface {

    /**
     * 假如由于一些原因我们在后期提供了新的接口规范，basefun --> basefunnew
     *  然后我们删除了basefun接口，会直接导致编译失败。
     * 那么如果使用继续使用@Override注解进行编译器强制检查
     */
    @Deprecated
    default void basefun(){
        System.out.println("旧版本的默认实现！");
    }

    default void basefunnew(){
        System.out.println("新的默认实现！");
    }

}
