package AbstractClass.Animal03;

/*
    测试类
    案例：《猫和狗》
    需求：采用抽象类的实现实现猫和狗的案例，并在测试类中进行测试。
 */

public class AnimalDemo {

    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.setName("加菲");
        a1.setAge(5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();

        System.out.println("--------");

        a1 = new Cat("加菲", 5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();

        Animal a2 = new Dog();
        a2.setName("小白");
        a2.setAge(3);
        System.out.println(a2.getName() + "," + a2.getAge());
        a2.eat();

    }

}
