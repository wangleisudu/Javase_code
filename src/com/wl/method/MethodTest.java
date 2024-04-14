package com.wl.method;

public class MethodTest {
    public static void main(String[] args) {

    }
}
class Person{
    //属性
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("人至少每天睡"+hour);

    }
    public  String interests(String hobby){
        System.out.println("我的兴趣爱好:"+hobby);
        return hobby;
    }
}

