package com.yt.TestReflection.test;

/**
 * 测试各种类型(class,interface,enum,annotation,primitive type,void)对应的java.lang.Class对象的获取方式
 */
public class Demo1 {
    public static void main(String[] args) {
        String path = "com.yt.TestReflection.bean.User";

        try {
            Class clazz = Class.forName(path);
            System.out.println(clazz.hashCode());

            //一个类只对应一个class对象
            Class clazz2 = Class.forName(path);
            System.out.println(clazz2.hashCode());

            Class strClazz = String.class;
            Class strClazz2 = path.getClass();
            System.out.println(strClazz==strClazz2);

            Class intClazz = int.class;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
