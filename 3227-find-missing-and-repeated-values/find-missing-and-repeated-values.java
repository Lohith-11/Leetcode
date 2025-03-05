class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
        int[] ans=new int[2];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                if(set.contains(num)){
                    ans[0]=num;
                }else{
                    count+=num;
                }
                set.add(num);
            }
        }
        int total=n*n;
        int sum=total*(total+1)/2;
        ans[1]=sum-count;
        return ans;
    }
}