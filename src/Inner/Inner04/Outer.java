package Inner.Inner04;

/*
    前提：
        存在一个类或者接口
        这里的类可以是具体类也可以是抽象类

    格式：
        new类名或者接口名(){
            重写方法；
        };

    本质：
        继承了该类或者实现了该接口的子类译名对象
 */

public class Outer {
    public void method() {
        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("译名");
            }
        };
    }
     */

//    show();

        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("译名内部类");
            }
        }.show();
         */

        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("译名内部类");
            }
        };

        i.show();
        i.show();

    }
}
