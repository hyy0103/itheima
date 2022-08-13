package String;

import java.util.Scanner;

/*
    一个用户登录的案例：
        一个用户一共有三次输入的机会。
 */

public class StringTest01 {

    public static void main(String[] args) {

        String username = "itheima";
        String password = "123";

        for(int i=0; i<3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的用户名：");
            String usn = sc.nextLine();

            System.out.println("请输入你的密码：");
            String psw = sc.nextLine();

            if (usn.equals(username) && psw.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的用户已被锁定，请与管理员联系。");
                } else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会。");
                }
            }
        }

    }
}
