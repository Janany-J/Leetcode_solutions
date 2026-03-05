class Solution {
    public int minOperations(String s) {
        int start0 = 0;
        int start1 = 0;
        for(int i=0;i<s.length();i++){
            char val1 = (i % 2 == 0) ? '0' : '1';
            char val2 = (i % 2 == 0) ? '1' : '0';
            if(s.charAt(i) == val1){
                start0++;
            }
            if(s.charAt(i) == val2){
                start1++;
            }
        }
        int res = Math.min(start0 , start1);
        return res;
    }
}