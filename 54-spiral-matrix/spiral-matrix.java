class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int rowSt=0;
        int rowEnd=matrix.length-1;
        int colSt=0;
        int colEnd=matrix[0].length-1;

        while(rowSt<=rowEnd && colSt<=colEnd){
            for(int i=colSt;i<=colEnd;i++){
                ans.add(matrix[rowSt][i]);
            }
            for(int i=rowSt+1;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
            }
            for(int i=colEnd-1;i>=colSt;i--){
                if(rowSt==rowEnd){
                    break;
                }
                ans.add(matrix[rowEnd][i]);
            }
            for(int i=rowEnd-1;i>=rowSt+1;i--){
                if(colSt==colEnd){
                    break;
                }
                ans.add(matrix[i][colSt]);
            }
            rowSt++;
            colSt++;
            rowEnd--;
            colEnd--;
        }
        return ans;
    }
}