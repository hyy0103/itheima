package Authority01;

public class Fu01 {

    private void show1(){
        System.out.println("private");
    }

    void show2(){
        System.out.println("默认");
    }

    protected void show3(){
        System.out.println("protected");
    }

    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu01 f = new Fu01();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }

}
