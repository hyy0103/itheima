package Test;

import java.util.Scanner;

public class Test08 {

    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

//        int index = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==number){
//                index = i;
//                break;
//            }
//        }

        //调用方法
        int index = getIndex(arr, number);
        System.out.println("Index: " + index);

    }

    //定义一个方法：查找指定的数据在数组中的索引
    public static int getIndex(int[] arr, int number){
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                index = i;
                break;
            }
        }
        return index;
    }

}
