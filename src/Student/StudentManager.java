package Student;

/*
    案例：学生管理系统
        1. 添加学生
        2. 查看学生信息
        3. 删除学生信息
        4. 修改学生信息
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student03> array = new ArrayList<Student03>();

        while (true) {
            //用输出语句完成主界面的编写
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1. 添加学生");
            System.out.println("2. 查看学生信息");
            System.out.println("3. 删除学生信息");
            System.out.println("4. 修改学生信息");
            System.out.println("5. 退出");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            int line = sc.nextInt();

            //用switch语句完成操作的选择
            switch (line) {
                default:
                    System.out.println("你输入的数字不存在，请输入1-5之间的数字。");
                case 1:
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case 2:
//                    System.out.println("查看学生信息");
                    findAllStudent(array);
                    break;
                case 3:
//                    System.out.println("删除学生信息");
                    deleteStudent(array);
                    break;
                case 4:
//                    System.out.println("修改学生信息");
                    updateStudent(array);
                    break;
                case 5:
//                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0); //  JVM退出
            }
        }

    }

    //定义一个方法，用于添加学生
    public static void addStudent(ArrayList<Student03> array) {

        //显示提示信息，提示要输入何种信息
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘输入的数据赋值
        Student03 s = new Student03();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中（保存）
        array.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student03> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
    }else{
        //显示表头信息
        //  \t就是tab键的位置
        System.out.println("学号\t姓名\t年龄\t居住地");

        //将集合中数据取出按照对于格式显示学生信息，年龄显示补充"岁"
        for (int i = 0; i < array.size(); i++) {
            Student03 s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }
}

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student03> array){
            //用键盘录入选择删除学生的信息
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要删除的学生的学号：");
            String sid = sc.nextLine();

            //遍历集合将对应的学生对象从集合中删除
            for (int i = 0; i < array.size(); i++) {
                Student03 s = array.get(i);
                if (s.getSid().equals(sid)) {
                    array.remove(i);
                    //给出删除成功的提示
                    System.out.println("删除学生成功");
                } else {
                    System.out.println("输入的学生的学号不存在");
                }
            }
    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student03> array){
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String sid = sc.nextLine();

        //键盘录入要修改的学生信息
        System.out.println("请输入学生的新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生的新居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student03 s = new Student03();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对于学生的信息
        for(int i=0; i<array.size(); i++){
            Student03 student = array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }

        //给出修改成功提示
        System.out.println("修改学生成功");
    }

}
