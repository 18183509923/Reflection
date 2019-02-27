package com.yt.fisrt.oop.testStatic.testThis;

public class Student {
    String name;
    int id;
    public Student(String name, int id){
        this(name);
        this.name = name;
        this.id = id;
    }

    

    public Student(String name){
        System.out.println("构造一个对象");
    }
    public void setName(String name){
        this.name = name;
    }
    public void study(){
        this.name = "张三";
        System.out.println(name+"在学习");
    }
    public void sayHello(String sname){
        System.out.println(name+"向"+sname+"说你好");
    }


}
