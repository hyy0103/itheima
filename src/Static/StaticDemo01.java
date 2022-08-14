package Static;

/*
    测试类
        static关键字是静态的意思，可以修饰成员方法，成员变量
        static修饰特点：
            * 被类的所有对象共享
                这也是我们班段时候使用静态关键字的条件
            * 可以通过类名调用
                当然，也可以通过对象名调用
 */

public class StaticDemo01 {
    public static void main(String[] args) {

        Student01.university = "清华大学";

        Student01 s1 = new Student01();
        s1.name = "小明";
        s1.age = 30;
//        s1.university = "清华大学";
        s1.show();

        Student01 s2 = new Student01();
        s2.name = "小红";
        s2.age = 32;
//        s2.university = "清华大学";
        s2.show();
    }

}
