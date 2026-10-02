public class BubbleSort {

    // Bubble Sort Function
    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            // Har turn me biggest element end me chala jata hai
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Agar left element bada hai to swap karo
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Agar ek bhi swap nahi hua
            // matlab array already sorted hai
            if (swapped == false) {
                break;
            }
        }
    }

    // Array print function
    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}