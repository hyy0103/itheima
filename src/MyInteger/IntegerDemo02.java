package MyInteger;

/*
    构造方法：
        public Integer (int value): 根据int值创建Integer对象（过时）
        public Integer (String s): 根据String值创建Integer对象（过时）

    静态方法获取对象：
        public static Integer valueOf (int i): 返回表示指定的int值的Integer实例
        public static Integer valueOf (String s): 返回一个保存指定值的Integer对象String
 */

public class IntegerDemo02 {

    public static void main(String[] args) {

        /*
        //过时的方法：

        //public Integer (int value): 根据int值创建Integer对象（过时）
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2= new Integer(80);
//        Integer i2 = new Integer("abc");  //NumberFormatException
        System.out.println(i2);

         */

        //public static Integer valueOf (int i): 返回表示指定的int值的Integer实例
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //public static Integer valueOf (String s): 返回一个保存指定值的Integer对象String
        Integer i2 = Integer.valueOf(80);
//        Integer i2 = Integer.valueOf("abc");   //NumberFormatException
        System.out.println(i2);

    }

}
