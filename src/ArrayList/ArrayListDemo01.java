package ArrayList;

/*
    ArrayList构造方法:
        public ArrayList(): 创建一个空的集合对象

    ArrayList添加方法:
        public boolean add(E e): 将指定元素追加到此集合的末尾
        public void add(int index, E element): 在此集合中的指定位置插入指定的元素
 */

import java.util.ArrayList;

public class ArrayListDemo01 {

    public static void main(String[] args) {
        //public ArrayList(): 创建一个空的集合对象
//        ArrayList<String> array = new ArrayList<>();  //写法一

        ArrayList<String> array = new ArrayList<String>(); //写法二；这两种方法都可以

        //public boolean add(E e): 将指定元素追加到此集合的末尾
        array.add("hello"); //index: 0
        array.add("world"); //index: 1  //index = 1+1
        array.add("java");  //index: 2  //index = 2+1

        //public void add(int index, E element): 在此集合中的指定位置插入指定的元素
        array.add(1,"javase");  //index: 1，代替原先index1的位置的元素
//        array.add(3,"javase");

        //IndexOutOfBoundsException
//        array.add(4,"javase");

        //输出集合
        System.out.println("array: " + array);

    }

}
