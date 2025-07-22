// Last updated: 7/22/2025, 11:45:42 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                ans++;
            }
        }
        return ans;
    }
}