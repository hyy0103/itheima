package StudentManagementSystem;

/*
    学生类（自己写）：
        学号
        姓氏
        名字
        年龄
        地址
 */

public class StudentLibrary {

    private String sid;
    private String surname;
    private String name;
    private String age;
    private String address;

    public StudentLibrary(){}

    public StudentLibrary(String sid, String surname, String name, String age, String address){}

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
