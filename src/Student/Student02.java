package Student;

public class Student02 {

    private String name;
    private int age;

//    构造方法
//    public Student02(){
//        System.out.println("无参构造方法");
//    }

    public Student02(){
    }

    public Student02(String name){
        this.name = name;
    }

    public Student02(int age){
        this.age = age;
    }

    public Student02(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + ", " + age);
    }

}
