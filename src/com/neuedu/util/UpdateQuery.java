package com.neuedu.util;

import com.neuedu.util.GetResultSet;
import com.neuedu.util.SqlUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UpdateQuery {
    //添加，删除，修改，--语句不一样，参数不一样，
    public static int update(String sql,Object ...objs){
        Connection conn=null;
        PreparedStatement pstm=null;
        int i=-1;

        conn=SqlUtil.getConn();
        try {
            pstm=conn.prepareStatement(sql);//有占位符，参数添加

            SqlUtil.insertParamentertoPreparedStatement(pstm,objs);

            i=pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            SqlUtil.close(pstm,conn);
        }

        return i;
    }

    //返回一个list
    public static<T> List<T> query(String sql, GetResultSet result, Object ...objs){//泛型方法
        Connection conn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        List<T> lists=new ArrayList<>();

        conn=SqlUtil.getConn();
        try {
            pstm=conn.prepareStatement(sql);
            SqlUtil.insertParamentertoPreparedStatement(pstm,objs);
            rs=pstm.executeQuery();
            while (rs.next()){
               T e=(T)result.get(rs);//对ResultSet对象的处理
                lists.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            SqlUtil.close(rs,pstm,conn);
        }
        return lists;

    }

}
