class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int j = nums.length - 1;
        while (left <= right) {
            int sql = nums[left] * nums[left];
            int sqr = nums[right] * nums[right];
            if (sql >= sqr) {
                res[j] = sql;
                left++;
            } else {
                res[j] = sqr;
                right--;
            }
            j--;
        }
        return res;
    }
}