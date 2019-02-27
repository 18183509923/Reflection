package com.yt.fisrt.oop.testStatic;

public class Student {
    String name = "123";
    int id;
    static int ss;
    public static void printSS(){
        String name = "456";
        System.out.println(ss);
    }

    public void study(){
        System.out.println(name+"在学习");
    }
    public void sayHello(String sname){
        System.out.println(name+sname+"说你好");
    }


    public static class Test{
        public static void main(String[] args) {
            Student.ss = 322;
            Student.printSS();
            Student s1 = new Student();

            s1.study();
        }
    }
}
