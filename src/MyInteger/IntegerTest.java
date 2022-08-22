package MyInteger;

/*
    案例：《字符串中数据排序》
    需求：有一个字符串："91 27 46 38 50"，
         请写程序思想最终输出结果是："27 38 46 50 91"
 */

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91 27 46 38 50";

//        System.out.println(s);

        //把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(" ");

//        for(int i=0; i< strArray.length; i++){
//            System.out.println(strArray[i]);
//        }

        //定义一个int数组，把String[]数组中的每一个元素存储到int数组中
        int[] arr = new int[strArray.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //对int数组进行排序
        Arrays.sort(arr);

        //把排序后的int数组重的元素进行拼接得到一个字符串，
        //这里拼接采用StringBuilder来实现
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }

        String result = sb.toString();

        //输出结果
        System.out.println("Result: " + result);

    }
}
