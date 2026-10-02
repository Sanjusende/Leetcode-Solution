import java.util.Scanner;
// public class recursion {
  
//     public static void main(String[] args) {
//         int result = factorial(5);
//         System.out.println("Factorial of 5 is: " + result);
//     }

//     public static int factorial(int n) {
//         if (n == 0) {
//             return 1;
//         } else {
//             return n * factorial(n - 1);
//         }
//     }
// }


public class PrintDecreasingNumber {

    public static void printDigits(int number) {

        // Base Case
        if (number == 0) {
            return;
        }

        // Print first
        System.out.print(number + " ");

        // Recursive Call
        printDigits(number - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printDigits(number);

        // scanner.close();
    }
}