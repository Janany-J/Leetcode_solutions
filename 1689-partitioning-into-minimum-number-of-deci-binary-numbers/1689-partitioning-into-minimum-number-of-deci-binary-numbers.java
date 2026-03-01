class Solution {
    public int minPartitions(String n) {
        int deci_binary = 0;
        for(char d : n.toCharArray()){
            deci_binary = Math.max(deci_binary, d - '0');
        }
        return deci_binary;
    }
}



