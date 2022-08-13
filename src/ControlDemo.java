public class ControlDemo {

    public static void main(String[] args) {

        //continue: 在用于循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行。
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------");

        //break: 用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前整个循环。
        for (int j = 1; j <= 5; j++) {
            if (j % 2 == 0) {
                break;
            }
            System.out.println(j);
        }
    }
}
