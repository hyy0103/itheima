package Polymorphism.Animal02;

/*
    动物操作类
 */

public class AnimalOperator {

    /*
    public void useAnimal(ParameterAndReturnValues.Cat c){   //ParameterAndReturnValues.Cat c = new ParameterAndReturnValues.Cat();
        c.eat();
    }

    public void useAnimal(Dog d){   //Dog d = new Dog();
        d.eat();
    }
     */

    public void useAnimal(Animal a){
        //Animal a = new ParameterAndReturnValues.Cat();
        //Animal a = new Dog();

        a.eat();
//        a.lookDoor();
    }

}
