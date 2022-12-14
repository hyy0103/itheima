package Test;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        //由于是6个评委打分，所以，接受评委分数的操作，用循环改进。
        for(int x=0; x<arr.length; x++){
            System.out.print("请输入第" + (x+1) + "个评委的打分：");
            arr[x] = sc.nextInt();
        }

        //printArray(arr);

        //定义方法实现获取数组中的最高分（数组最大值），调用方法
        int max = getMax(arr);

        //定义方法实现获取数组中的最低分（数组最小值），调用方法
        int min = getMin(arr);

        //定义方法实现获取数组中的所有元素的和（数组元素求和），调用方法
        int sum = getSum(arr);

        //按照计算规则进行计算得到平均分
        int avg = (sum-max-min)/(arr.length-2);

        //输出平均分
        System.out.println("选手的最终得分是：" + avg);
    }


    public static int getMax(int[] arr){
        int max = arr[0];
        for(int x=1; x<arr.length; x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for(int x=1; x<arr.length; x++){
            if(arr[x]<min){
                min=arr[x];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;

        for(int x=0; x<arr.length; x++){
            sum += arr[x];
        }
        return sum;
    }

    public static void printArray(int[] arr){
        System.out.print("[");

        for(int x=0; x<arr.length; x++){
            if(x==arr.length-1){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x] + ",");
            }
        }

        System.out.print("]");
    }

}
