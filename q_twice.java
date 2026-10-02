public class q_twice {

    public static boolean printtwice(int nums[]) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 2, 6, 7, 8, 1, 10};

        System.out.println(printtwice(nums));
    }
}