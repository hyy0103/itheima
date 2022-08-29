package List;

/*
    《List集合特有方法》
    1. void add (int index E, element): 在此集合中的指定位置插入元素
    2. E remove (int index): 删除指定索引的元素，返回被修改的元素
    3. E set (int index, E element): 修改指定索引的元素，返回被删除的元素
    4. E get (int index): 返回指定索引处的元素
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add (int index E, element)
//        list.add(1, "javaee");
//         list.add(11, "javaee");   //IndexOutOfBoundsException

        //E remove (int index)
//        list.remove(3); //IndexOutOfBoundsException
//        list.remove(1);

        //E set (int index, E element)
//        list.set(1,"java");
//        System.out.println(list.set(1, "javaee"));
//        System.out.println(list.set(2, "javaee"));
//        System.out.println(list.set(3, "javaee"));  //IndexOutOfBoundsException

        //E get (int index): 返回指定索引处的元素
//        System.out.println(list.get(2));
//        System.out.println(list.get(11));   //IndexOutOfBoundsException

        //输出集合对象
        System.out.println(list);

        //遍历集合
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        for(int i=0; i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

    }

}
