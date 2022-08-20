package MyInteger;

/*
    《基本类型包装概述》
        将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
        常用的操作之一：用于基本数据类与字符串之间的转换

     基本数据类型(包装类）：byte (Byte), short (Short), int (Integer),
                        long (Long), float (Float), double (Double),
                        char (Character), boolean (Boolean)
 */

public class IntegerDemo01 {
    public static void main(String[] args) {
        //需求：我需要一个数据是否在int范围内？
        //public static final int MIN_VALUE
        //public static final int MAX_VALUE

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
