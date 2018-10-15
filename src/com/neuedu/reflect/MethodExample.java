package com.neuedu.reflect;

import com.neuedu.entity.Student;

import java.lang.reflect.Method;

public class MethodExample {
    public static void main(String[] args) throws Exception {
        Class<?> cla=Student.class;
        Object object=cla.newInstance();
        //调用一个方法
        //getMethod()得到
        //第一个参数：方法名， 第二个参数：此方法中参数的类型--Class
       Method method= cla.getMethod("setSno",String.class);

       //执行：-invoke 第一个参数：对象，方法的实参

      Object o= method.invoke(object,"201810150023");

      Method get=cla.getMethod("getSno");
      Object getresult=get.invoke(object);
        System.out.println(getresult);

    }
}
