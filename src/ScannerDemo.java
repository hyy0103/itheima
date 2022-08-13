import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        System.out.println("Enter a number for x: ");

        //创建对象
        java.util.Scanner sc = new java.util.Scanner(System.in);

        //接收数据
        int x = sc.nextInt();

        //输出数据
        System.out.println("x: " + x);

    }
}
