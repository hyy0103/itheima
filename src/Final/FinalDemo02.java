package Final;

/*
    final修饰局部变量：
        * 变量是基本类型：final修饰值的是基本类型的数据值不能发生改变
        * 变量是引用类型：final修饰值的是引用类型的数据值不能发生改变，
                        但是地址里面的内容是可以发生改变。
 */

public class FinalDemo02 {

    public static void main(String[] args) {

        //final修饰基本类型变量
        int age = 25;
        age = 35;
        System.out.println(age);

        //final修饰引用类型变量
        final Student s = new Student();
        s.age = 50;
        System.out.println(s.age);

    }

}
