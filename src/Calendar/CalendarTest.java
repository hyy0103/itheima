package Calendar;

/*
    案例：《二月天》
    需求：获取任意一年的二月有多少天
    思路：
        1. 键盘录入任意的年份
        2. 设置日历对象的年、月、日
            * 年：来自于键盘录入
            * 月：设置为3月，月份从0开始，所以设置的值是2
            * 日：设置为1日
        3. 3月1日往前推一天，就是2月的最后一天
        4. 获取这一天并输出
 */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

    public static void main(String[] args) {
        //键盘录入任意的年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的二月份的年份：");
        int year = sc.nextInt();
//        System.out.println(year);

        //设置日历对象的年、月、日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //3月1日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE,-1);

        //获取这一天输出
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年的二月份有" + date + "天");

    }

}
