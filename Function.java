import java.util.*;
public class Function {
    public static int funcofsum(int a,int b){ // parameter or formal parameter
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b value");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = funcofsum(a, b);// argument or actual parameter
       System.out.println("sum of a and b :" +sum);
    }

}
