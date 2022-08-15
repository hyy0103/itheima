package AbstractClass.Animal01;

/*
    测试类

    抽象类的特点
        * 抽象类和抽象方法必须使用abstract关键字修饰
            public abstract class 类名{}
            public abstract void eat();
        * 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
        * 抽象类不能实力化
            抽象类如何实例化呢
 */

public class AnimalDemo {

//    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.eat();
//    }

//    Animal a = new Animal();

    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.sleep();

    }
}
