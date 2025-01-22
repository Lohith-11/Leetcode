class Solution {
    public boolean binarySearch(int[] matrix,int target){
        int start=0,end=matrix.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(matrix[mid]==target){
                return true;
            }
            if(matrix[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target){
                return binarySearch(matrix[i],target);
            }
        }
        return false;
        
    }
}