package ArrayList;

/*
    案例：存储字符串并遍历
        需求：创建一个存储字符串的集合，存储3个字符串的元素，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;

public class ArrayListTest01 {

    public static void main(String[] args) {

        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //往集合中添加字符串对象
        array.add("小明");
        array.add("小红");
        array.add("小刚");
        array.add("小强");

//        //遍历集合，首先要能够获取到集合中的每一个元素，通过get(int index)方法实现
//        for(int i=0; i<=array.size()-1; i++){
//            System.out.println(array.get(i));
//        }
//
////        //获得该合集的长度，通过size()方法实现
////        System.out.println(array.size()); //4

        //遍历集合的通用格式
        for(int i=0; i<array.size(); i++){
            String s = array.get(i);    //为什么不直接输出呢，因为我们可能要拿这个对象做其他操作
            System.out.println(s);
        }

    }

}
