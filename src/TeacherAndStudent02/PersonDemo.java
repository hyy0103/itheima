package TeacherAndStudent02;

/*
    测试类
 */

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("王老师");
        t1.setAge(35);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("孙老师", 33);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
    }
}
