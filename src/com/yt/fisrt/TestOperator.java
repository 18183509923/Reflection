package com.yt.fisrt;

public class TestOperator {
    public static void main(String[] args) {
        double d = 10.2%3;
        System.out.println(d);

        int a = 3;
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
