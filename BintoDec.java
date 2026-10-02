import java.util.*;
public class BintoDec {
    public static void main(String[] args) {
        System.out.println("Enter the binary number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Decimal equivalent: " + bintodec(n));
    }

    public static int bintodec(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        return dec;
    }
}
