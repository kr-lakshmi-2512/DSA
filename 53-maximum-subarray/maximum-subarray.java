class Solution {
    public int maxSubArray(int[] nums) {
        int max_far=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            max_far=Math.max(curr,max_far);
        }
        return max_far;
        
    }
}