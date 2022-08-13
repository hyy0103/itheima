package String;

/*
    《字符串反转》（普通版）
        需求：
            定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。
            例如，键盘录入abc，输出结果为cba。
 */

import java.util.Scanner;

public class StringTest05 {

    public static void main(String[] args) {

        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //调用方法，用一个变量接受结果
        String s = reverse(line);

        //输出结果
        System.out.println("s: " + s);

    }

    //定义一个方法，实现字符串反转
    /*
        两个明确：
            返回值类型：String
            参数：String s
     */
    public static String reverse(String s){
        //在方法中把字符串倒着遍历，然后把每一个得到的字符串拼接成一个字符串并返回
        String ss = "";

        for(int i=s.length()-1; i>=0; i--){
            s += s.charAt(i);
        }
        return ss;
    }

}
