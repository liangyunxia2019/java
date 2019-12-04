package com.tedu.cn ;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    @Test
    public void m1(){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getMaximum(12 ));
    }
    @Test
    public void m2(){
        Date date=new Date();
        System.out.println(date);
        //返回1970年1月1日 00点到现在的毫秒数
        System.out.println(date.getTime());
        //将毫秒数转为日期对象
        Date d1= new Date(4585665);
        System.out.println(d1+"******");
        System.out.println(d1.before(date));
    }



    @Test
    public void m3(){
        //将具体日期格式化
        SimpleDateFormat format=new SimpleDateFormat("yyyy年-MM月-dd日 hh:mm:ss");
        String date =format.format(new Date());
        System.out.println(date);
    }


    @Test
    public void m4() throws ParseException {
        /**
         * 字符串转日期
         */
        String date="2019.12.04";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
        Date d=sdf.parse(date);
        System.out.println(d);
    }
}
