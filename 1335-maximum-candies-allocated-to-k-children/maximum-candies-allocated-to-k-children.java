class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        Arrays.sort(candies);
        long left=1;
        long right=candies[n-1];
        long ans=0;
        while(left<=right){
            long mid=left+((right-left)/2);
            long count=0;
            for(int i=0;i<n;i++){
                if(candies[i]>=mid){
                    long x=candies[i]/mid;
                    count+=x;
                }
            }
            if(count>=k){
                ans=Math.max(ans,mid);
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int)ans;
    }
}