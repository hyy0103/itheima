package ParameterAndReturnValues.Cat;

/*
    测试类
 */

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat();   //new ParameterAndReturnValues.Cat()
        c2.eat();
    }
}
