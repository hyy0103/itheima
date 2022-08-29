package List;

/*
    ListIterator: 列表迭代器
     通过List集合的listIterator()方法得到，所以说它是list集合持有的迭代器
     用于允许程序员沿任一方向遍历列表的列表的迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置

    istIterator中的常用方法
     E next(): 返回迭代的下一个元素
     boolean hasNext(): 如果迭代具有更多元素，则返回true
     E previous(): 返回列表中的上一个元素
     boolean hasPrevious(): 如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回true
     void add (E e): 将指定的元素插入列表
 */

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //通过list集合的listIterator()方法得到


    }
}
