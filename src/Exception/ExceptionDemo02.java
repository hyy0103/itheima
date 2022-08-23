package Exception;

/*
    异常：《编译时异常和运行时异常的区别》
        所有的RuntimeException类及子类的实例被称为运行时异常，其他的异常都是编译时异常。

        编译时异常：必须显示处理，否则程序就会发生错误，无法通过编译。
        运行时异常：无需显示处理，也可以和编译时异常一样处理。
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args) {
//        method();
        method2();
    }

    //运行时异常
    public static void method2(){
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException p){
            p.printStackTrace();
        }
    }

    //编译时异常
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
