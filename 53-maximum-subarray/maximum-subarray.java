class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int Maxsum = nums[0];
        for(int i=1;i< nums.length;i++){
            sum = Math.max(nums[i],sum + nums[i]);
            Maxsum = Math.max(sum,Maxsum);
        }
        return Maxsum;
    }
}