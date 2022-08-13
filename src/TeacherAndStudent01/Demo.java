package TeacherAndStudent01;

/*
    案例：《老师和学生》
    需求：定义老师类和学生类，然后写代码测试，最后找到老师类和学生类当中的共性内容，
        抽取出一个父类，用继承的方法改写代码，并进行测试。
 */

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("陈老师");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("李老师", 32);
        System.out.println(t2.getName()+ "," + t2.getAge());
        t2.teach();

    }
}
