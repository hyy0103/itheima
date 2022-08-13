package Method;

import java.util.Scanner;

public class MethodTest02 {

    public static void main(String[] args) {
        //isEvenNumber(10);

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        isEvenNumber(number);
    }

    public static void isEvenNumber(int number){
        if(number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

}
