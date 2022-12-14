package Exception;

/*
    《异常处理》：try-catch方法

    try{
        可能出现异常的代码；
    }catch(异常类名 变量名){
        异常的处理代码；
    }

 */

public class TryCatchDemo {
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
//            System.out.println("你访问的数组的索引不存在");
            e.printStackTrace();    //把异常的错误信息输入在控制台
        }
    }
}
