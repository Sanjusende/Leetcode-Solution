import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // search element///////////////////////////////////////////////////////
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == key) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Element found are at index value:" + key);


        } else {
            System.out.println("Element not found");
        }
    }
}
