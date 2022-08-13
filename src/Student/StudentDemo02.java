package Student;

/*
    测试类
 */

import Student.Student02;

public class StudentDemo02 {

    public static void main(String[] args) {
        //创建对象
        //无参构造方法
        Student02 s1 = new Student02();
        s1.show();

        //public Student(String name)
        Student02 s2 = new Student02("小明");
        s2.show();

        //public Student02(int age)
        Student02 s3 = new Student02(18);
        s2.show();

        //public Student02(String name, int age)
        Student02 s4 = new Student02("小明", 18);
        s3.show();

    }
}
