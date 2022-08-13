package Method;

public class MethodTest04 {

    public static void main(String[] args) {
        //1. 方法名（参数）；
        //isEvenNumber(10);
        //true;
        //不能输出任何结果，所以没有什么意义。

        //2. 数据类型 变量名=方法名（参数）
        boolean flag = isEvenNumber(10);
        //boolean flag = true;
        System.out.println(flag);

    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }

    }

}
