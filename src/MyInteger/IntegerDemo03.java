package MyInteger;

/*
    《int和String的相互转换》
    基本类型包装类的最常见操作就是：用于基本类型和字符串之间的相互转换：

    1. int转换为String
        public static String valueOf (int i):
            返回int参数的字符串表示形式。该方法是String类中的方法。

    2. String转换为int
        public static int parseInt (String s):
            将字符串解析为int类型。该方法是Integer类中的方法。

 */

public class IntegerDemo03 {
    public static void main(String[] args) {
        //int --- String
        int number = 100;

        //方式一（不专业，但跟方便简洁）
        String s1 = "" + number;
        System.out.println(s1);

        //方式二（更专业）
        //public static String valueOf (int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);

        System.out.println("--------");

        //String --- int
        String s = "100";

        //方式一
        //String --- Integer --- int
        Integer i = Integer.valueOf(s);

        //public int intValue()
        int x = i.intValue();
        System.out.println(x);

        //方式二
        //public static int parseInt (String s)
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
