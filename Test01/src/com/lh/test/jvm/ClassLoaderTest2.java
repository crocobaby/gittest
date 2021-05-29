package com.lh.test.jvm;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest2 {

    public static void main(String[] args) {
        try {
            //当前类的类加载器
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //线程上下文获取类加载器
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);

            //扩展类加载器
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(parent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

}
