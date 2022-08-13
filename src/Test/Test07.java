package Test;

public class Test07 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        System.out.println(compare(arr, arr2));

    }

    public static boolean compare(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for(int x=0; x<arr.length; x++){
            if(arr[x]!=arr2[x]){
                return false;
            }
        }
        return true;
    }
}
