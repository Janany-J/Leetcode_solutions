class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
       int min_distance = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
            int distance = Math.min(min_distance,Math.abs(i-start));
            if(distance < min_distance){
                min_distance=distance;
            }
            }
        }
        return min_distance;
    }
}