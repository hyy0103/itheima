package Date.DateTest;

/*
    测试类

    案例：《日期工具类》
    需求：定义一个日期工具（DateUtils），包括两个方法：把日期转换为指定格式的字符串；
        把字符串解析为指定格式的日期，然后定义一个测试类（DateDemo），测试工具类的方法。
 */

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);

        System.out.println("-------------------------");

        String s = "2020-08-23 19:04:04";
        Date dd = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
