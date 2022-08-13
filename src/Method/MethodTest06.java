package Method;

public class MethodTest06 {

    public static void main(String[] args) {

        //调用方法
        int result = sum(10, 20);
        System.out.println(result);

        double result2 = sum(10, 20);
        System.out.println(result2);

        int result3 = sum(10, 20, 30);
        System.out.println(result3);

    }

    //方法一
    public static int sum(int a, int b){
        return a+b;
    }

    //方法二
    public static double sum(double a, double b){
        return a+b;
    }

    //方法三
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

}
