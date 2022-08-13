package String;

import java.util.Scanner;

public class StringTest02 {

    public static void main(String[] args) {

        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //遍历字符串，获得字符串中的每一个字符
//        for(int i=0; i<3; i++){
//            System.out.println(line.charAt(i));
//        }

        //遍历字符串，获得字符串的长度
//        System.out.println(line.length());

        for(int i=0; i<line.length(); i++){
            System.out.println(line.charAt(i));
        }

    }

}
