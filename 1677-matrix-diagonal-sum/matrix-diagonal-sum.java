class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            ans+=mat[i][i];
            if(i!=mat.length-1-i){
                ans+=mat[i][mat.length-1-i];
            }
        }
        return ans;
        
    }
}