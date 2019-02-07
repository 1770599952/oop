package com.oop.base.base;

public class Base{
    public int a=10;

    private static int inti = 0;

    static {

    }

    public  Base(){
        inti = 9;
    }

    public void m1(){
        System.out.println(this.a);
    }
    
    public static void main(String[] args) {
    	  Child base =new Child();
          base.m1();
	}


}

class Child extends Base{

    public int a = 5;

}