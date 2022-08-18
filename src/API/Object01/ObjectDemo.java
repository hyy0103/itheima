package API.Object01;

/*
    Object是类层次结构的根，每个类都可以将Object作为超类。
    所有类都是直接或者间接的继承自该类。
 */

//看方法的源码，选中方法，按ctrl+B或者command+B
//建议所有子类重写此方法，自动生成即可。

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小明");
        s.setAge(18);
        System.out.println(s);  //API.Object.Student@48140564
        System.out.println(s.toString());

        /*
            public void println(Object x) {
                String s = String.valueOf(x);
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }

            public static String valueOf(Object obj) {  //obj=x;
                return (obj == null) ? "null" : obj.toString();
            }

            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
         */



    }
}
