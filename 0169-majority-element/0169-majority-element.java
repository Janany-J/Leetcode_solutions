class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int element = -1;
        int count=0;
        for(int num :  nums){
            if(count==0){
            element = num;
            count = 1;
            }
            else if(num == element){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num : nums){
            if(element == num)
                count++;
        }
        if(count > n/2){
            return element;
        }
        else{
            return -1;
        }
    }
}