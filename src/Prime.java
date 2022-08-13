public class Prime {

    public static void main(String[] args) {

        int sum=0;
        for (int i = 2; i <= 100; i++) {
            for (int j=2; j<=i; j++) {
                if (i%j==0 && i!=j) {
                    break;
                }
                if (i%j==0 && i==j) {
                    System.out.println(i);
                    sum+=i;
                }
            }
        }
        System.out.println("The sum of all prime numbers between 1-100 is " + sum);
    }

}

