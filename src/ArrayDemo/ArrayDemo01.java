package ArrayDemo;

public class ArrayDemo01 {

    public static void main(String[] args) {
        int[] arr = new int [3];

        /*
            左边：
                int: 数组中的元素是int类型
                []: 说明这是一个数组
                arr: 数组的名称

            右边：
                new: 为数组申请内存空间
                int: 数组中的元素是int类型
                []: 说明这是一个数组
                3: 数组长度。
         */

        //输出数组名
        System.out.println(arr); //[I@7d417077

        //输出数组中的元素
        System.out.println(arr[0]); //0
        System.out.println(arr[1]); //0
        System.out.println(arr[2]); //0
    }


}
