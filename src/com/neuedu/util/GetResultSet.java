package com.neuedu.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface GetResultSet<E> {//泛型类
    //是对ResultSet的一个对象进行处理
    E get(ResultSet rs) throws SQLException;
}
