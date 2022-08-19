package Bubblesort;

/*
    冒泡排序
        原理：按一组数据按照固定的规则进行排列，对要进行排序的数据中相邻的数据进行两两比较，
            将较大的数据放在后面，依次对所有的数据进行操作，直至所有数据按要求完成程序。
 */

public class BubblesortDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前： " + arrToString(arr));

        /*
        //第一次
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第一次排序： " + arrToString(arr));

        //第二次
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第二次排序： " + arrToString(arr));

        //第三次
        for(int i=0; i<arr.length-3; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第三次排序： " + arrToString(arr));

        //第四次
        for(int i=0; i<arr.length-4; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第四次排序： " + arrToString(arr));
         */

        for(int x=0; x<arr.length-1; x++){
            for(int i=0; i<arr.length-1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序后： " + arrToString(arr));
    }

    //把数组重的元素按照指定的规则组成一个字符串：[元素1，元素2，...]
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
