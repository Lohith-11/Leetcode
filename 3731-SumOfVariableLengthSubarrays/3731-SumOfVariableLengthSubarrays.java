// Last updated: 7/22/2025, 11:45:38 AM
class Solution {
    public int subarraySum(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                ans+=nums[j];
            }
        }
        return ans;
    }
}