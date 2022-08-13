package Test;

public class Test04 {

    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=1;

        //arr[2] = arr[0] + arr[1];
        //arr[3] = arr[1] + arr[2];
        //arr[4] = arr[2] + arr[3];

        for(int x=2; x<arr.length; x++){
            arr[x] = arr[x-2] + arr[x-1];
        }
        System.out.println("第二十个月兔子的对数是：" + arr[19]);

    }



}
