package Interface.InterfaceDemo;

/*
    接口中的变量是一个常量，并且还是静态修饰。可以通过接口名直接访问。

    * 接口的成员特点
        * 成员变量
            只能是常量
            默认修饰符：public static final
        * 构造方法
            接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在
            一个类如果没有父类，默认继承Object类
        * 成员方法
            只能是抽象方法
            默认修饰符：public abstract
 */

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
//    public static final int num3 =30;
    int num3 = 30;

//    public Inter(){}    //接口里面不能有构造方法

//    public void show(){}

    public abstract void method();
    void show();    //默认为public abstract void show();

}
