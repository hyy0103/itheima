package AbstractClass.Animal02;

/*
    抽象类
 */

public abstract class Animal {

    private int age = 20;   //变量
    private final String city = "北京"; //常量

    public Animal(){}

    public Animal(int age) {
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city = "上海";    //因为这是一个final的常量，所以不能进行赋值
        System.out.println(city);
    }

    public abstract void eat();

}
