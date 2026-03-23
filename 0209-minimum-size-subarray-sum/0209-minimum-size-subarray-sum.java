class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0,currentsum = 0;
        int res = Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++){
            currentsum += nums[right];
            while(currentsum >= target){
                res = Math.min(res,right-left+1);
                currentsum -= nums[left];
                left++;
            }
        }
        return res  == Integer.MAX_VALUE ? 0 : res;
    }
}