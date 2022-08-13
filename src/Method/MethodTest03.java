package Method;

public class MethodTest03 {

    public static void main(String[] args) {
        getMax(10.0, 15.0);

        System.out.println("-----");

        double a=5;
        double b=8;
        getMax(a,b);
    }

    public static void getMax(double a, double b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }

}
