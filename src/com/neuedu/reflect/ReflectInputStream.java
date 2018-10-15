package com.neuedu.reflect;

import java.io.InputStream;
import java.net.URL;

public class ReflectInputStream {
    public static void main(String[] args) {
        //Class对象--实例化
        Class<?>  cla=ReflectInputStream.class;
        //ClassLoader对象 --
        ClassLoader classLoader=cla.getClassLoader();
        //方法getResourceAsStream，同时添加参数（默认src/中提取），形成InputStream
        InputStream is=classLoader.getResourceAsStream("db.properties");
        /*URL url=classLoader.getResource("db.properties");
        System.out.println(url);*/
        System.out.println(is);
    }
}
