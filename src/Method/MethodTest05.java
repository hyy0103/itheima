package Method;

public class MethodTest05 {

    public static void main(String[] args) {
        int result = getMax(10, 20);
        System.out.println(result);

        System.out.println(getMax(10, 20));

    }

    public static int getMax(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }

    }

}
