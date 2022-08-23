package Calendar;

/*
    Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作理你字段提供了一些方法。

    Calendar提供了一个类方法getInstance用于获得Calendar对象，其日历字段已使用当前日期和时间初始化，
        Calendar rightNow = Calendar.getInstance();
 */

import java.util.Calendar;

public class CalendarDemo01 {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();    //多态的形式
//        System.out.println(c);

        //public int get (int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
