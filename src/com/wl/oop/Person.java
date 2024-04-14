package com.wl.oop;

public class Person {
    //属性
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少保证每天"+hour+"小时的睡眠");
    }

    public void intrtsts(String hobby){
        System.out.println("我的爱好是"+hobby);
    }
}
