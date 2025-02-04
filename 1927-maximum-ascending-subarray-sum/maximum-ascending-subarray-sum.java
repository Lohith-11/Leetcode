class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans=nums[0];
        int x=ans;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                ans+=nums[i];
                x=Math.max(ans,x);
            }else{
                ans=nums[i];
            }
        }
        return x;
    }
}