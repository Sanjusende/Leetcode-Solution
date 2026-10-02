public class kaddansalo {
    public static void kadansalgo(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);// ms = cs > ms ? cs : ms; // print the maximum sum of the subarray
        }

        System.out.println("Maximum sum is: " + ms); 
    }

    public static void main(String[] args) {
        int numbers[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        kadansalgo(numbers);
    }
}
