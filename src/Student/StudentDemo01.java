package Student;

//学生测试类

public class StudentDemo01 {

    public static void main(String[] args) {

        //创建对象
        Student01 s = new Student01();

        //使用成员变量
//        System.out.println(s.name);
//        System.out.println(s.age);

        //给成员变量赋值
        s.name = "小明";
        s.setAge(18);

//        System.out.println(s.name);
//        System.out.println(s.age);

        //使用成员方法
//        s.study();
//        s.doHomework();

        //调用show方法
        s.show();

    }

}
