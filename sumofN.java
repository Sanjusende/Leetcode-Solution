import java.util.*;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the naturfal number");
        int n = sc.nextInt();
        // sum of first n natural number.......................
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        // print table of enter user input................
        int table=1;
        for(int i=1; i<=10;i++){
             table = n*i;
              System.out.println(" "+table);
        }

       
    }
}
