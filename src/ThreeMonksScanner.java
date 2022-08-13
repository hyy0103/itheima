import java.util.Scanner;

public class ThreeMonksScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height 1: ");
        int height1 = sc.nextInt();

        System.out.println("Enter height 2: ");
        int height2 = sc.nextInt();

        System.out.println("Enter height 3: ");
        int height3 = sc.nextInt();

        int tempHeight = (height1>height2)? height1:height2;
        int maxHeight = (tempHeight>height3)? tempHeight:height3;

        System.out.println("Max height: " + maxHeight);
    }

}
