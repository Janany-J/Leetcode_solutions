class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int canditate = -1;
        int count=0;
        for(int num : nums){
            if(count == 0){
                canditate = num;
                count=1;
            }
            else if(num == canditate){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num : nums){
            if(canditate==num){
               count++;
            }
        }
        if(count > n/2){
            return canditate;
        }
        else{
            return -1;
        }
    }
}