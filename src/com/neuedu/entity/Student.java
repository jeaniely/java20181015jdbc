package com.neuedu.entity;

import java.sql.Date;

public class Student {//与表中数据字段一一对应
    public String sno;
    protected String sname;
     String ssex;
    private int sage;
    private String sdept;
    private Date birthday;



    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return sno + '\t' + sname + '\t' + ssex + '\t' + sage +'\t'+ sdept + '\t' + birthday ;
    }
}
