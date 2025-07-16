class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int val=0;
        int n=grid.length;
        boolean ans=helper(grid,0,0,val,n);
        return ans;
    }
    public boolean helper(int[][] grid,int row,int col,int val,int n){
        if(row<0 || col<0 || row>=n || col>=n || grid[row][col]!=val){
            return false;
        }
        if(val==(n*n)-1){
            return true;
        }

        boolean choice1=helper(grid,row-2,col+1,val+1,n);
        boolean choice2=helper(grid,row-1,col+2,val+1,n);
        boolean choice3=helper(grid,row+1,col+2,val+1,n);
        boolean choice4=helper(grid,row+2,col+1,val+1,n);
        boolean choice5=helper(grid,row+2,col-1,val+1,n);
        boolean choice6=helper(grid,row+1,col-2,val+1,n);
        boolean choice7=helper(grid,row-1,col-2,val+1,n);
        boolean choice8=helper(grid,row-2,col-1,val+1,n);

        return choice1 || choice2 || choice3 || choice4 || choice5 || choice6 || choice7 || choice8;
    }

}