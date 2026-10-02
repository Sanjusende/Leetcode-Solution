import java.util.*;
public class average3 {
    public static int average(int a, int b, int c) {
        int sum=a+b+c;
        return sum/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");  
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        System.out.println("The average of the three numbers is: " + average(a, b, c));

    }
}
