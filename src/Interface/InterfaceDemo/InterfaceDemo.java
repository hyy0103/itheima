package Interface.InterfaceDemo;

/*
    测试类
 */

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;   //接口里面没有成员变量，系统默认为常量
        System.out.println(i.num);
//        i.num2 = 40;  //它被final修饰了
        System.out.println(i.num2);
        System.out.println(Inter.num);
    }
}
