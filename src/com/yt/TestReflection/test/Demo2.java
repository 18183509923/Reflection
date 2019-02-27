package com.yt.TestReflection.test;

import com.sun.xml.internal.ws.spi.db.FieldSetter;
import sun.reflect.generics.scope.ConstructorScope;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String[] args) {
        String path = "com.yt.TestReflection.bean.User";

        try {
            Class clazz = Class.forName(path);

            //获得包名+类名
            System.out.println(clazz.getName());
            //获得类名
            System.out.println(clazz.getSimpleName());

            //获得属性信息
            //只能获得public的field
            Field[] fileds = clazz.getFields();
            //获得所有的field
            Field[] fields = clazz.getDeclaredFields();
            Field f = clazz.getDeclaredField("uname");
            System.out.println(fields.length);

            for (Field temp : fields){
                System.out.println("属性"+temp);
            }

            //获取方法信息
            Method[] methods = clazz.getDeclaredMethods();
            Method m01 = clazz.getDeclaredMethod("getUname",null);
            //如果方法有参，则必须传递参数类型对应的class对象
            Method m02 = clazz.getDeclaredMethod("setUname", String.class);
            for (Method m : methods){
                System.out.println("方法"+m);
            }

            //获得构造器信息
            Constructor[] constructors = clazz.getDeclaredConstructors();
            Constructor c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
            System.out.println("获得构造器"+c);

            for (Constructor temp : constructors){
                System.out.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
