class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n  = nums.length;
        int[] ans = new int[n+n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+n-i-1]=nums[i];
        }
        return ans;
    }
}