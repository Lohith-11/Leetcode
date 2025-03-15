class Solution {
    public int minCapability(int[] nums, int k) {
        int n=nums.length;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<left){
                left=nums[i];
            }
            if(nums[i]>right){
                right=nums[i];
            }
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=0;i<n;i++){
                if(nums[i]<=mid){
                    count++;
                    i++;
                }
            }
            if(count>=k){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}