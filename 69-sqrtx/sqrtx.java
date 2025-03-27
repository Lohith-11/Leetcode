class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        if(x==0 || x==1){
            return x;
        }
        int ans=1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<=x/mid){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}