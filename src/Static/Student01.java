package Static;

public class Student01 {

    public String name;
    public int age;
    public static String university;    //static代表共享

    public void show(){
        System.out.println(name + "," + age + "," + university);
    }

}
