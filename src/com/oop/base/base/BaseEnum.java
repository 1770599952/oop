package com.oop.base.base;

public enum BaseEnum {

    SUCCESS("0000", "SUCCESS");

    static int init = 0;

    private String code;
    private String msg;

     BaseEnum(String code, String masg) {
        // init = 9  编译会报错。
        this.code = code;
        this.msg = masg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMasg(String masg) {
        this.msg = masg;
    }

    public static void main(String[] args) {
        System.out.println(BaseEnum.init);
    }
}
