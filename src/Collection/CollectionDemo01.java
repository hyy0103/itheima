package Collection;

/*
    《Collection集合概述和使用》

    Collection集合概述
    * 是单列集合的顶层接口，它表示一组对象，这些对象也称为Collection的元素
    * JDK不提供此接口的任何直接实现，它提供更具体的子接口（如Set和List）实现

    创建Collection集合的对象
    * 多态的方式
    * 具体的实现类ArrayList()
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素：boolean add (E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
    }
}
