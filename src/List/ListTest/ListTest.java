package List.ListTest;

/*
    案例：《List集合存储学生对象并遍历》
    需求：创建一个存储学生对象的集合，存储三个学生对象，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Student s1 = new Student("小明", 18);
        Student s2 = new Student("小红", 19);
        Student s3 = new Student("小刚", 20);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //用迭代器遍历
        Iterator<Student> it = list.listIterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("--------");

        //用for循环遍历
        for(int i=0; i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
