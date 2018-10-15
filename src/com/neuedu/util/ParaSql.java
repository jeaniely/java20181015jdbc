package com.neuedu.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class ParaSql {
   /* public static void main(String[] args)  throws Exception {
        InputStream is=new FileInputStream("src/db.properties");
        Properties properties=new Properties();
        properties.load(is);

        System.out.println(properties.getProperty("driver"));
        *//*System.out.println(is);*//*
    }*/
    //提取文件，生成输入流，把输入流加载到Properties对象中
    private static Properties properties=new Properties();
    static {
        try {
          /*  InputStream is=new FileInputStream("src/db.properties");*/
            InputStream is=ParaSql.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //提取文件中的各种配置的数据
    public static final String DRIVER=properties.getProperty("driver");
    public static final String URL=properties.getProperty("url");
    public static final String USERNAME=properties.getProperty("username");
    public static final String PASSWORD=properties.getProperty("password");





}
