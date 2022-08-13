package TeacherAndStudent02;

public class Teacher extends Person{

    public Teacher(){}
    public Teacher(String name, int age){
//        this.name = name;
//        this.age = age;
        super(name, age);
    }
    public void teach(){
        System.out.println("用爱育人");
    }
}
