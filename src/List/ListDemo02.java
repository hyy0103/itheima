package List;

/*
    《并发修改异常》
    需求：一个集合：List<String> list = new ArrayList<String>();
        里面有三个元素：list.add("hello"); list.add("world"); list.add("java");
        遍历集合，得到每一个元素，看有没有"world"元素，如果有，我就添加一个"java"元素，请写代码实现。

    ConcurrentModificationException: 当不允许这样的修改时，可以通过检测对象的并发修改的方法来抛出此异常
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("world")){
                list.add("javaee");
            }
        }

        System.out.println(list);

    }
}
