package StudentManagementSystem;

/*
    案例：学生管理系统（自己写）
            1. 添加学生
            2. 查看学生信息
            3. 删除学生信息
            4. 修改学生信息
 */

import Student.Student;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {

    public static void main(String[] args) {
        ArrayList<StudentLibrary> array = new ArrayList<StudentLibrary>();

        while(true) {
            System.out.println("--------学生管理系统--------");
            System.out.println("1. 添加学生");
            System.out.println("2. 查看学生信息");
            System.out.println("3. 删除学生信息");
            System.out.println("4. 修改学生信息");
            System.out.println("5. 退出系统");
            System.out.println("请选择输入你的选择：");

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if (number == 1) {
                System.out.println("添加学生");
            } else if (number == 2) {
                System.out.println("查看学生信息");
            } else if (number == 3) {
                System.out.println("删除学生信息");
            } else if (number == 4) {
                System.out.println("修改学生信息");
            } else if (number == 5) {
                System.out.println("谢谢使用");
                System.exit(0);
            } else if (number < 1 || number > 5) {
                System.out.println("您输入的数字有误，请输入1-5之间的数字");
            }
        }

//        public static void addStudent(ArrayList<StudentLibrary> array){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入学生的学号：");
//            String sid = sc.nextLine();
//
//            System.out.println("请输入学生的姓氏：");
//            String surname = sc.nextLine();
//
//            System.out.println("请输入学生的名字：");
//            String name = sc.nextLine();
//
//            System.out.println("请输入学生的年龄：");
//            String age = sc.nextLine();
//
//            System.out.println("请输入学生的地址：");
//            String address = sc.nextLine();
//
//            StudentLibrary s = new StudentLibrary();
//            s.setSid(sid);
//            s.setName(name);
//            s.setAge(age);
//            s.setAddress(address);
//
//            array.add(s);
//            System.out.println("添加学生成功");
//
//        }

//    public static void viewStudent(){}
//
//    public static void deleteStudent(){}
//
//    public static void editStudent(){}

    }
}
