package Test;

public class ArrayTest03 {

    public static void main(String[] args) {
        int[] arr = {11, 23, 24, 67, 99};
        int min = arr[0];

        for(int x=0; x<arr.length; x++){
            if(arr[x]<min){
                min=arr[x];
            }
        }
        System.out.println("Min: " + min);

    }

}
