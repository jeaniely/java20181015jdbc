package com.neuedu.reflect;

import com.neuedu.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FiledExample {
    public static void main(String[] args) {
        Class<?> cla=Student.class;

        //成员变量
        //所有的成员变量，public，private protected 默认
       Field[] fields= cla.getDeclaredFields();
        for (Field f:fields
             ) {
            System.out.println(Modifier.toString(f.getModifiers())+"    "+f.getType()+"     "+f.getName());
        }
        System.out.println("-------------------------------------------");
        //提取公共的成员变量，public修饰
        Field[] fields1=cla.getFields();
        for (Field f:fields1
                ) {
            System.out.println(Modifier.toString(f.getModifiers())+"    "+f.getType()+"     "+f.getName());
        }

    }
}
