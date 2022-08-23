package MyInteger;

/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型
 */

public class IntegerDemo04 {
    public static void main(String[] args) {

        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i =  Integer.valueOf(100);  //装箱
        Integer ii = 100;   //自动装箱

        //拆箱：把包装类类型转换为对应的基本数据类型
        // ii += 200;
//        ii = ii.intValue() + 200; //拆箱
        ii += 200;  //i =i+200; 自动拆箱；i=i+200;自动装箱
        System.out.println(ii);

        /*
            注意：在使用包装类类型的时候，如果做操作，最好先判断时候为null
                我们推荐的是，只要是对象，只是用钱就必须进行不为null的判断
         */
        Integer iii = null;
        if(iii!=null) {
            iii += 300; //NullPointerException
        }

    }
}
