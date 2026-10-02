public class Largest {
    public static int findLargest(int numbers[]) {
        // int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update largest if the current number is greater
            }
        }
        return smallest; // Return the largest number found in the array
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        int result = findLargest(numbers);
        System.out.println("Largest number in the array: " + result);
    }
}
