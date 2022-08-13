package DogAndCat;

/*
    测试类
    案例：《猫和狗》
    需求：请采用继承的思想思想猫和狗的案例，并在测试类中测试。
 */

public class AnimalDemo {
    public static void main(String[] args) {

        Dog d1 = new Dog("小白", 5);
        System.out.println(d1.getName() + "," + d1.getAge());
        d1.lookDoor();

        Dog d2 = new Dog();
        d2.setName("小蓝");
        d2.setAge(4);
        System.out.println(d1.getName() + "," + d1.getAge());
        d1.lookDoor();

        Cat c1 = new Cat("小黄", 3);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat();
        c2.setName("小红");
        c2.setAge(1);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();
    }
}
