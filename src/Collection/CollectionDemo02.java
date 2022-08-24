package Collection;

/*
    《Collection集合常用方法》
    1. boolean add (E e): 添加元素
    2. boolean remove (Object o): 从集合中移除指定的元素
    3. void clear(): 清空集合中的元素
    4. boolean contains (Object o): 判断集合中时候存在指定的元素
    5. boolean isEmpty(): 判断集合时候为空
    6. int size(): 集合的长度，也就是集合中元素的个数
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {

    public static void main(String[] args) {

        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //boolean add (E e)
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("world"));
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove (Object o)
//        System.out.println(c.remove("world"));
//        System.out.println(c.remove("javaee"));

        //void clear()
//        c.clear();

        //boolean contains (Object o)
//        System.out.println(c.contains("world"));    //true
//        System.out.println(c.contains("javaee"));

        //boolean isEmpty()
//        System.out.println(c.isEmpty());

        //int size()
        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);
    }

}
