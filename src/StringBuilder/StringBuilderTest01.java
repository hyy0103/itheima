package StringBuilder;

/*
    《拼接字符串》（升级版）
        需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
        并在控制台输出结果。
        例如，数组为int[] arr = {1, 2, 3}；，执行该方法后结果为[1, 2, 3]。
 */

public class StringBuilderTest01 {

    public static void main(String[] args) {

        //定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //调用方法，用一个变量接受结果
        String s = arrayToString(arr);

        //输出结果
        System.out.println("s: " + s);

    }

    //定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串的返回
    /*
        两个明确：
            返回值类型：String
            参数列表：int[] arr
     */
    public static String arrayToString(int[] arr){
        //在方法中使用StringBuilder按照要求进行拼接，并把结果转换为String返回
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
