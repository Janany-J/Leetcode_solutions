class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length-1;
        int sum=0;
        Arrays.sort(cost);
        for(int i=n;i>=0;i-=3){
            sum += cost[i];
            if(i-1 >=0){
                sum += cost[i-1];
            }
        }
        return sum;
    }
}