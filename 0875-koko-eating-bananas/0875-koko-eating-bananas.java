class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=0;
        for(int p:piles)
            right = Math.max(right,p);
        while(left < right){
            int mid = left + (right-left)/2;
            int hrs = 0;
            for(int p : piles){
                hrs += (p + mid - 1)/mid;
            }
            if(hrs > h)
                left = mid+1;
            else
                right = mid;
            }
        
        return left;
    }
}