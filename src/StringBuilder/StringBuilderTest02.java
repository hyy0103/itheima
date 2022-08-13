package StringBuilder;

/*
    《字符串反转》（升级版）
            需求：
                定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
                例如，键盘录入abc，输出结果为cba。
 */

import java.util.Scanner;

public class StringBuilderTest02 {

    public static void main(String[] args) {

        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        //调用方法，用一个变量接收结果
        String s = myReverse(line);

        //输出结果
        System.out.println("s:" + s);

    }

    //定义一个方法，实现字符串反转
    /*
        两个明确：
            返回值类型：String
            参数：String s
     */
    public static String myReverse(String s){
        //在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
        //String --- StringBuilder --- reverse() --- String

//        StringBuilder sb = new StringBuilder();
//        sb.reverse();
//        String ss = sb.toString();
//        return ss;

        return new StringBuilder(s).reverse().toString();

    }


}
