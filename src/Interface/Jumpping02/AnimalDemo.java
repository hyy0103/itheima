package Interface.Jumpping02;

/*
    测试类

    案例：《猫和狗》
    需求：对猫和狗进行训练，他们就可以跳高了，这里加入了跳高功能。采用抽象类和接口来实现猫狗案例。

 */

public class AnimalDemo {

    public static void main(String[] args) {

        //猫
        Jumpping j = new Cat();
        j.jump();

        System.out.println("-------");

        Animal a1 = new Cat();
        a1.setName("加菲");
        a1.setAge(5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();
//        a.jump();

        a1 = new Cat("加菲", 5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();

        System.out.println("-------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();

        //狗
        Jumpping j2 = new Dog();
        j2.jump();

        System.out.println("-------");

        Animal a2 = new Dog();
        a2.setName("小白");
        a2.setAge(3);
        System.out.println(a2.getName() + "," + a2.getAge());
        a2.eat();
//        a2.jump();

        a2 = new Dog("小白", 3);
        System.out.println(a2.getName() + "," + a2.getAge());
        a2.eat();

        System.out.println("-------");

        Dog d = new Dog();
        d.setName("小白");
        d.setAge(3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.jump();

    }

}
