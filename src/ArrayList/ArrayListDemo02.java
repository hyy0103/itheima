package ArrayList;

/*
    《ArrayList的常见方法》
        1. public boolean remove(Object o): 删除指定元素，返回删除是否成功
        2. public E remove(int index): 删除指定索引处的元素，返回被删除的元素
        3. public E set(int index, E element): 修改指定索引处的元素，返回被删除的元素
        4. public E get(int index): 返回指定索引处的元素
        5. public int size(): 返回集合中的元素的个数
 */

import java.util.ArrayList;

public class ArrayListDemo02 {

    public static void main(String[] args) {

        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //public boolean remove(Object o): 删除指定元素，返回删除是否成功
//        System.out.println(array.remove("world"));    //true 移除成功
//        System.out.println(array.remove("javaee"));   //false 移除失败

        //public E remove(int index): 删除指定索引处的元素，返回被删除的元素
//        System.out.println(array.remove(1));    //world 移除成功
//        System.out.println(array.remove(3));    //IndexOutOfBoundsException 移除失败

        //public E set(int index, E element): 修改指定索引处的元素，返回被删除的元素
//        System.out.println(array.set(1, "javaee")); //替换成功，原元素被替代
//        System.out.println(array.set(3, "javaee")); //IndexOutOfBoundsException 替换失败

        //public E get(int index): 返回指定索引处的元素
//        System.out.println(array.get(0));   //hello
//        System.out.println(array.get(1));   //world
//        System.out.println(array.get(2));   //java
//        System.out.println(array.get(3));   //IndexOutOfBoundsException 返回失败

        //public int size(): 返回集合中的元素的个数
//        System.out.println(array.size());   //3

        //输出集合
        System.out.println("array: " + array);

    }

}
