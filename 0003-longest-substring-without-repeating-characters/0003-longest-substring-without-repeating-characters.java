class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int[] pos=new int[128];
        int start=0,end=0;
        for(char ch: s.toCharArray()){
            start=Math.max(start,pos[ch]);
            maxlen=Math.max(maxlen,end-start+1);
            pos[ch]=end+1;
            end++;
        }
        return maxlen;
    }
}