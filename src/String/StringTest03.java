package String;/*
    需求：
        键盘录入一个字符串，统计该字符串的大写字母字符，小写字母字符，数字字符出现的次数。
        （不考虑其他的字符）
 */

import java.util.Scanner;

public class StringTest03 {

    public static void main(String[] args) {

        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //要统计三种字符串，需定义三个统计变量，初始值为0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount =0;

        //遍历字符串，得到每一个字符
        for(int i=0; i<line.length();i++){
            char ch = line.charAt(i);

            //判断该字符串属于哪一种类型，然后对应类型的统计变量+1
            if(ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }

        }

        //输出三种类型的字符串的个数
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("数字字母有：" + numberCount + "个");

    }

}
