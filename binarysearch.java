public class binarysearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {

                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 102;
        int result = binarySearch(numbers, key);
        if (result == -1) {
            System.out.println("Key not found in the array: " +     result);
        } else {
            System.out.println("Key found at index: " + result);
        }

    }
}
