// Last updated: 7/22/2025, 11:45:35 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,Math.abs(nums[i%n]-nums[(i+1)%n]));
        }
        return ans;
    }
}