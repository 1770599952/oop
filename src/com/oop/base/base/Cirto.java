package com.oop.base.base;

public class Cirto {
    public static void main(String[] args) {

        /**
         * 四种创建方式
         */
        CharSequence charSequence = "12";
        String str1 = "12";
        String str2 = "12".substring(0);
        String str3 = new String("12");


        System.out.println(charSequence == str1);
        System.out.println(charSequence == str2);
        System.out.println(charSequence == str3);

    }
}
