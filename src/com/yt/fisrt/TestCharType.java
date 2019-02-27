package com.yt.fisrt;

public class TestCharType {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '尚';
        char c3 = '\n';
       /* System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);*/

        char c4 = 'a';
        int i = c4 + 2;
        char c5 = (char)i;
        System.out.println(c5);
    }
}
