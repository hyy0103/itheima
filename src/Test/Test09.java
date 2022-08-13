package Test;

public class Test09 {

    //已知一个数组，交换后的数组的元素是这个数组的元素的反顺序

    public static void main(String[] args) {

        int[] arr = {19, 28, 37, 46, 50};
        //int[] arr2 = {50, 46, 37, 28, 19};

//        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
//            int tem = arr[start];
//            arr[start] = arr[end];
//            arr[end] = tem;
//        }

        reverse(arr);
        printArray(arr);
    }

        public static void printArray(int[] arr){
            System.out.print("[");

            for(int i=0; i<arr.length; i++){
                if(i==arr.length-1){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(arr[i] + ",");
                }
            }

            System.out.print("]");
        }

        public static void reverse(int[] arr){
            for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
        }

    }

}
