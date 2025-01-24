class Solution {
    public int missingNumber(int[] nums) {
        int x=nums.length;
        int ans=(x*(x+1))/2;
        int y=0;
        for(int i=0;i<nums.length;i++){
            y+=nums[i];
        }
        return ans-y;
        
    }
}