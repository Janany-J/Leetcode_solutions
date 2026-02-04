class Solution {
    public void moveZeroes(int[] nums) {
        int Nonzeroelement = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[Nonzeroelement] = nums[i];
                Nonzeroelement++;
            }
        }
        for(int i = Nonzeroelement;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}