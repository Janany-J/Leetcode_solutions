class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowvalues = new int[m];
        int[] colvalues = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    rowvalues[i]++;
                    colvalues[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && rowvalues[i]==1 && colvalues[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}