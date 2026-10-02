public class subarray {
    public static void subarrays(int numbers[]) {
        int ts = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                   
                }
                ts++;
                System.out.println();
            }
            System.out.println("Sum: " + sum);
        }
         
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        subarrays(numbers);

    }
}
