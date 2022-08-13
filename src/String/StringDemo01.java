package String;

public class StringDemo01 {

/*
    String的构造方法：
        1. public String(): 创建一个空白字符串对象，不含有任何内容
        2. public String(char[] chs): 根据字符数组的内容，来创建字符串对象
        3. public String(byte[] bys): 根据字符数组的内容，来创建字符串对象
        4. String s = "abc"; 直接赋值的方式创建字符串对象，内容就是abc
 */

    public static void main(String[] args) {

        //1. public String(): 创建一个空白字符串对象，不含有任何内容
        String s1 = new String();
        System.out.println("s1: " + s1);

        //2. public String(char[] chs): 根据字符数组的内容，来创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2: " + s2);

        //3. public String(byte[] bys): 根据字符数组的内容，来创建字符串对象
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3: " + s3);

        //4. String s = "abc"; 直接赋值的方式创建字符串对象，内容就是abc
        String s4 = "abc";
        System.out.println("s4: " + s4);
    }



}
