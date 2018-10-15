package com.neuedu.reflect;

import com.neuedu.entity.Student;

public class ReflectExample {
    public static void main(String[] args) {
        //类调用class
        Class<?>  cla=Student.class;
        System.out.println(cla);

         //类对象调用getClass()
        Student student=new Student();
        Class<?> cla1=student.getClass();
        System.out.println(cla1);

        //Class类中的静态方法forName();
        try {
            Class<?> cla2=Class.forName("com.neuedu.entity.Student");
            System.out.println(cla2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
