package com.neuedu.statementexample;

import com.neuedu.util.SqlUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementEx01 {
    //删除
    public static void main(String[] args) throws  Exception{
        getall();
    }
    public static void getall() throws  Exception{
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        String sno="2018101201 or 1=1";//sql注入
        String sql="select * from student where sno="+sno;
        connection=SqlUtil.getConn();
        statement=connection.createStatement();
        resultSet= statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getObject(1));
        }
        SqlUtil.close(resultSet,statement,connection);
    }


    public static void delete() throws  Exception{
        Connection connection=null;
        Statement statement=null;
        String sno="2018101202";
        String sql="delete from student where sno="+sno;
        connection=SqlUtil.getConn();
        statement=connection.createStatement();
        int i= statement.executeUpdate(sql);
        System.out.println(i);
        SqlUtil.close(statement,connection);
    }
}
