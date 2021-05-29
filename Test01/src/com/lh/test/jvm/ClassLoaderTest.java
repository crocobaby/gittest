package com.lh.test.jvm;

public class ClassLoaderTest {

    public static void main(String[] args) {

        //系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取山更，扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //获取引导类加载器
        System.out.println(extClassLoader.getParent());

        //获取当前用户类的类加载器
        System.out.println(ClassLoaderTest.class.getClassLoader());  //使用系统类加载器进行加载

        //使用引导类加载器进行加载的 ->核心类库都是使用引导类加载器加载的
        System.out.println(String.class.getClassLoader()); //String类加载器为 null
    }

}
