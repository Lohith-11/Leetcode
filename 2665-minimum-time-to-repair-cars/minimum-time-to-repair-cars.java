class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n=ranks.length;
        long left=Long.MAX_VALUE;
        long right=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(ranks[i]>right){
                right=ranks[i];
            }
            if(ranks[i]<left){
                left=ranks[i];
            }
        }
        right=right*cars*cars;
        long ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            long count=0;
            for(int i=0;i<n;i++){
                count+=Math.sqrt(mid/ranks[i]);
                if(count>=cars){
                    ans=mid;
                    right=mid-1;
                    break;
                }
            }
            if(count<cars){
                left=mid+1;
            }   
        }
        return ans;
    }
}