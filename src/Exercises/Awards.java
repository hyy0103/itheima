package Exercises;

import java.util.Scanner;

public class Awards {

    public static void main(String[] args) {

        System.out.println("输入你的分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 95 && score <= 100) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 90 && score <= 94) {
            System.out.println("奖励玩一次游乐场");
        } else if (score >= 80 && score <= 89) {
            System.out.println("奖励一个变形金刚");
        } else {
            System.out.println("一顿胖揍");
        }
    }

}
