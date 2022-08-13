package Extends;

/*
    测试类
 */

public class Demo01 {
    public static void main(String[] args) {
        Fu01 f = new Fu01();
        f.method1();

        Zi01 z = new Zi01();
        z.method02();
        z.method1();    //子类继承了父类
    }
}
