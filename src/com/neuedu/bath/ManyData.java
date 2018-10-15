package com.neuedu.bath;

import com.neuedu.util.DateUtil;
import com.neuedu.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ManyData {
    public static void main(String[] args) throws  Exception{
        Connection connection=null;
        PreparedStatement pstm=null;

        String sql="insert into student(sno,sname,ssex,sage,sdept,birthday) values(?,?,?,?,?,?)";
         connection=SqlUtil.getConn();
         connection.setAutoCommit(false);//手动提交
        //connection.setAutoCommit(true);//默认是true，自动提交
         pstm=connection.prepareStatement(sql);
         for(int i=0;i<20;i++){
             SqlUtil.insertParamentertoPreparedStatement(pstm,"2018"+i+30,"name"+i+30,"女",(20+i),"语文系",DateUtil.getDate("2018-02-02"));
             pstm.addBatch();//添加到批量
         }
        pstm.executeBatch();//批量执行
        connection.commit();
        SqlUtil.close(pstm,connection);
    }
}
