import java.util.*;
public class pqs2 {
    public static boolean isEven(int n) {
        if(n%2==0){
            // System.out.println(n + " is an even number");
            return true;
        } else {
            // System.out.println(n + " is  an odd number");
            return false;
        }
    }
    public static void main(String[] args)
     {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n));

    }
}

