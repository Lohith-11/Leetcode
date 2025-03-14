class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int x=quantities.length;
        Arrays.sort(quantities);
        int left=1;
        int right=quantities[x-1];
        int ans=Integer.MAX_VALUE;

        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=0;i<x;i++){
                count+=Math.ceil((double)quantities[i]/mid);
            }
            if(count<=n){
                ans=Math.min(ans,mid);
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}