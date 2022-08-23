package Exception;

/*
    异常：程序出现了不正常的情况
    Error: 严重问题，不需要处理
    Exception: 称为异常类，他表示程序本身可以处理的问题
    * RuntimeException: 在编译期是不检查的，出现问题，需要我们回来修改代码
    * 非RuntimeException: 编译期必须处理的，否则程序不能通过编译，就更不能正常运行
 */

public class ExceptionDemo01 {
    public static void main (String[] args){
        method();
    }

    public static void method(){
        int[] arr = {1,2,3};
//        System.out.println(arr[1]);
//        System.out.println(arr[3]);   //ArrayIndexOutOfBoundsException 异常
        System.out.println(arr[2]);
    }
}
