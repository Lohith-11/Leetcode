class Solution {
    public void solveSudoku(char[][] board) {
        if(helper(board,0,0)){
            return ;
        }
        return;
    }
    public boolean helper(char[][] board,int row,int col){
        if(row==9){
            return true;
        }

        int nextRow=row;
        int nextCol=col+1;

        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(board[row][col]!='.'){
            return helper(board,nextRow,nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=(char)('0'+ digit);
                if(helper(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public boolean isSafe(char[][] board,int row,int col,int digit){

        for(int i=0;i<9;i++){
            if(board[i][col]==(char)('0'+digit)){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(board[row][j]==(char)('0'+digit)){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==(char)('0'+digit)){
                    return false;
                }
            }
        }
        return true;
    }
}