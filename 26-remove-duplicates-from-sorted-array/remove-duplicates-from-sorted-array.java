class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[ans]){
                nums[ans+1]=nums[i];
                ans++;
            }
        }
        return ans+1;
    }
}