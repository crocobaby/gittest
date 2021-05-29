package com.lh.test.jvm;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest1 {

    public static void main(String[] args) {

        //系统类加载器
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for(URL url :urLs){
            System.out.println(url.toExternalForm());
        }

        //引导类加载器加载
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);

    }

}
