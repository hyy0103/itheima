package Inner.Inner01;

/*
    内部类
 */

public class Outer {

    private int num = 10;

    public class Inner{

        public void show(){
            System.out.println();
        }

    }

    public void method(){
//        show();

        Inner i = new Inner();
        i.show();
    }

}
