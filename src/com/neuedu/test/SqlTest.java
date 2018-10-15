package com.neuedu.test;

import com.neuedu.entity.Student;
import com.neuedu.util.GetResultSet;
import com.neuedu.util.UpdateQuery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SqlTest {
    public static void main(String[] args) {
        List<Student> listu=getAll();
        for (Student u:listu
             ) {
            System.out.println(u);

        }
    }

    //使用查找
    public static List<Student> getAll(){
        String sql="select * from student";
        List<Student> listu=UpdateQuery.query(sql, new GetResultSet<Student>() {
            @Override
            public Student get(ResultSet rs) throws SQLException {
                Student student=new Student();
                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSsex(rs.getString("ssex"));
                student.setSage(rs.getInt("sage"));
                student.setSdept(rs.getString("sdept"));
                student.setBirthday(rs.getDate("birthday"));

                return student;
            }
        });
        return listu;
    }
}
