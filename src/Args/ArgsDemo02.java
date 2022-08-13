package Args;

public class ArgsDemo02 {

    //对于引用类型的参数，形式参数的改变，影响实际参数的值
    //首次输出：20
    //二次输出：200

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用引用方法前：" + arr[1]);
        change(arr);
        System.out.println("调用引用方法后：" + arr[1]);
    }

    public static void change(int[] arr){
        arr[1] = 200;
    }

}
