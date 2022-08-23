package Exception;

/*
   《异常处理》：Throwable的成员方法

    public String getMessage()
        返回此throwable的详细信息字符串

    public String toString()
        返回此可抛出的简短描述

    public void printStackTrace()
        把异常的错误信息输入在控制台

 */

public class ThrowableDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); //new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();

            //public String getMessage()
            // System.out.println(e.getMessage());
            // 系统异常的原因：Index 3 out of bounds for length 3

            //public String toString()
            System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

            //public void printStackTrace()
            e.printStackTrace();    //显示的异常报错原因最详细
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length
            // at Exception.ThrowableDemo.method(ThrowableDemo.java:27)
            //at Exception.ThrowableDemo.main(ThrowableDemo.java:20)
        }
    }
}

/*
    public class Throwable{
        private String detailMessage;

        public Throwable (String message){
            detailMessage = message;
        }

        public String getMessage(){
            return detailMessage;
        }
    }
 */
