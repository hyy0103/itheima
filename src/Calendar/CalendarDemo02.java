package Calendar;

/*
    《Calendar的常用方法》
    1. public int get (int field)
        返回给定日期字段的值
    2. public abstract void add (int field, int amount)
        根据日历的规则，将指定的时间量添加或减去给定的日历字段
    3. public final void set (int year, int date)
        设置当前日历的年月日
 */

import java.util.Calendar;

public class CalendarDemo02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //public abstract void add (int field, int amount)
        //需求一：3年前的今天
//        c.add(Calendar.YEAR,-3);

//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public final void set (int year, int date)
        //需求二：10年后的5天前
//        c.add(Calendar.YEAR,10);
//        c.add(Calendar.DATE,-5);
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public final void set (int year, int date)
        c.set(2048,11,11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
