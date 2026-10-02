
import java.util.*;
public class loops {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of iterations:");
        int n=sc.nextInt();

        // //for loop
        // for(int i=0;i<n;i++){
        //     System.out.print(" "+i);
        // }
        // System.out.println();


// // while loop...........................................
// int i = 0;
// while (i < n) {
//     System.out.print(" " + i);
//     i++;
// }
// System.out.println();

// do while loop...........................................
int i = 0;
do{
    System.out.print(" "+i);
    i++;
}
while(i<n);

    }
}
