package Args;

public class ArgsDemo04 {

    public static void main(String[] args) {
        int[] arr = {89, 56, 23, 48, 70, 37};
        int number = getMax(arr);
        System.out.println("Max number: " + number);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr.length>max){
                max = arr[i];
            }
        }
        return max;
    }
}
