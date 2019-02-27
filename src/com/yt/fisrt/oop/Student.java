package com.yt.fisrt.oop;

public class Student {
    //静态数据
    String name;
    int id;
    int age;
    String gender;
    int weight;
    Computer computer;
    //动态的行为
    public void study(){
        System.out.println(name+"在学习");
    }
    public void sayHello(String sname){
        System.out.println(name+"向"+sname+"说你好");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "严总";
        s1.study();
        s1.sayHello("尚学堂");
        Student s2 = new Student();
        s2.age = 18;
        s2.name = "老严";
    }

}
