public class selectionsort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minpos]) {
                    minpos = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        System.out.println("Original array:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
