package Date;

/*
    构造方法：
        public SimpleDateFormat ()
            构造是一个SimpleDateFormat，使用默认模式和日期格式

        public SimpleDateFormat (String pattern)
            构造是一个StringDateFormat使用给定的模式和默认日期格式

    格式化：从Date到String
        public final String format (Date date)
            将日期格式化日期/时间字符串

    解析：从String到Date
        public Date parse (String source)
            从给定字符的开始解析文本以生成日期
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化：从Date到String
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("-----------------------");

        //解析：从String到Date
        String ss = "2022-08-23 17:05:05";

        //ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}
