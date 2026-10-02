import java.util.*;

public class prime {
    public static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void priminRang(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {

                System.out.print(i + " ");
            }
             

        }
       System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Prime numbers in the range are:");
        priminRang(n);
    }
}