import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        // rectangel pattern............................
        Scanner sc = new Scanner(System.in);
        System.out.println("enter i values");
        int n = sc.nextInt();
        System.out.println("enter j values");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
