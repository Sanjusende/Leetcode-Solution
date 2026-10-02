import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 12, 11, 13, 5, 6 };
    //    Arrays.sort(arr);
    //    System.out.println("Sorted array:");
    //    printArray(arr);
    //    Arrays.sort(arr,0,3);
    //    System.out.println("Sorted array:");
    //    printArray(arr); 
    //    Arrays.sort(arr, Collections.reverseOrder());
       Arrays.sort(arr,0,3, Collections.reverseOrder());
        System.out.println("Sorted array:");
        printArray(arr);


        
    }
}
