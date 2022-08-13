package StringBuilder;

/*
    《String 转换为 StringBuilder》
        public StringBuilder(String s): 通过构造方法就可以实现把String 转换为 StringBuilder
 */

public class StringToStringBuilder {

    public static void main(String[] args) {
        //String 转换为 StringBuilder
        String s = "hello";

//        StringBuilder sb = s; //  这个是错误的做法

        //public StringBuilder(String s): 通过构造方法就可以实现把String 转换为 StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }

}
