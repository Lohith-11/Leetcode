class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=k-1;
        int min=Integer.MAX_VALUE;
        int n=blocks.length();
        while(j<n){
            int count=0;
            for(int a=i;a<=j;a++){
                if(blocks.charAt(a)=='W'){
                    count++;
                }                
            }
            min=Math.min(min,count);
            i++;
            j++;
        }
        return min;        
    }
}