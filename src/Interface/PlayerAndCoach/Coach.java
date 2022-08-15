package Interface.PlayerAndCoach;

//抽象教练类
public abstract class Coach extends Person{

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public void teach(){}

}
