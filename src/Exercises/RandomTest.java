package Exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

    public static void main(String[] args) {

        //随机产生一个1-100之间的数字
        Random r = new Random();
        int number = r.nextInt(100)+1;

        while(true) {
        //使用键盘录入实现
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要猜的数字：");
        int guessNumber = sc.nextInt();

            //比较输入的数字和系统产生的数据，根据不同情况进行猜测结果显示
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜，你猜对了！");
                break;
            }
        }
    }

}
