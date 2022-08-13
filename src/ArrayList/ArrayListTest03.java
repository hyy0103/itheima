package ArrayList;

/*
    案例：存储学生对象并遍历（升级版）
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合。
            学生的姓名和年龄来自于键盘录入。
 */

import Student.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        /*
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的输入赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //往集合中添加学生对象
        array.add(s);
         */

        //为了提高代码的复用，我们用方法来改进程序
        addStudent(array);
        addStudent(array);
        addStudent(array);

        //遍历集合，采用通用遍历格式实现
        for(int i=0; i<array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    /*
        两个明确：
            返回值类型：void
            参数：ArrayList<Student> array
     */
    public static void addStudent(ArrayList<Student> array){
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的输入赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //往集合中添加学生对象
        array.add(s);
    }

}
