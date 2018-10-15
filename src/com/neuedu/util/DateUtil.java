package com.neuedu.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static Date getDate(String dateString){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateu=null;
        try {
            dateu=sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date(dateu.getTime());
    }
}
