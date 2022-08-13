package ArrayList;

/*
    案例：存储学生对象并遍历（普通版）
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合。
            学生的姓名和年龄来自于键盘录入。
 */

import Student.Student;

import java.util.ArrayList;

public class ArrayListTest02 {

    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("小明","18");
        Student s2 = new Student("小刚","19");
        Student s3 = new Student("小强","20");

        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合，采用通用遍历格式实现
        for(int i=0; i< array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }

    }

}
