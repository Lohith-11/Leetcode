class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        String[][] board=new String[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=".";
            }
        }
        helper(ans,temp,board,0);
        return ans;
    }
    public void helper(List<List<String>> ans,List<String> temp,String[][] board,int row){
        if(row==board.length){
            ans.add(new ArrayList<>(print(temp,board)));
            temp.removeAll(temp);
            return;
        }

        for(int col=0;col<board[row].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]="Q";
                helper(ans,temp,board,row+1);
                board[row][col]=".";
            }
        }
    }
    public boolean isSafe(String[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=="Q"){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=="Q"){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        return true;
    }
    public List<String> print(List<String> temp,String[][] board){
        String x="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                x+=board[i][j];
            }
            temp.add(x);
            x="";
        }
        return temp;
    }

}