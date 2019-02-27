package com.yt.fisrt.oop.testStatic.testThis.inherit;

public class Animal {
    String eye;

    public void run(){
        System.out.println("跑跑");
    }

    public void eat(){
        System.out.println("吃吃");
    }
    public void sleep(){
        System.out.println("睡睡");
    }
}


class Mammal extends Animal{
    public void taisheng(){
        System.out.println("胎生");
    }

    static class Bird extends Animal{
        //重写父类run的方法
        public void run(){
            super.run();
            System.out.println("小鸟");
        }

        public void eggSheng(){
            System.out.println("卵生");
        }

    }


}


