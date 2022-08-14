package Static;

/*
    static访问特点:

        非静态的成员方法能访问：
            * 静态的成员变量
            * 非静态的成员变量
            * 静态的成员方法
            * 非静态的成员方法

        静态的成员方法能访问：
            * 静态的成员变量
            * 静态的成员方法

        总结：静态成员方法只能访问静态成员
 */

public class Student02 {
    //非静态成员变量
    private String name = "小陈";
    //静态成员变量
    private static String university = "清华大学";

    //非静态成员方法
    public void show1(){
        System.out.println();
    }

    //非静态成员方法
    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    //静态成员方法
    public static void show3(){}

    //静态成员方法
    public static void show4(){
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }
}
