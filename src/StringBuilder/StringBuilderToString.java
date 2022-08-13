package StringBuilder;

/*
    《把StringBuilder转换为String》
       public String toString(): 通过toString()就可以实现把 StringBuilder 转换为 String
 */

public class StringBuilderToString {

    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

//        String s = sb; //这个是错误的做法

        //public String toString(): 通过toString()就可以实现把 StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);
    }

}
