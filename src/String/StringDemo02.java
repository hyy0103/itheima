package String;

public class StringDemo02 {

    public static void main(String[] args) {

        /* 方法：main（存储地址如下：）
            char[] chs (001)
            String s1 (002)
            String s2 (003)
            String s3 (004)
            String s4 (004)
         */

        //构造方法的方式得到对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1==s2); //false

        //直接赋值的方法得到对象
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4); //true

        //比较字符串对象地址是否相同
        System.out.println(s1==s3); //false

    }

}
