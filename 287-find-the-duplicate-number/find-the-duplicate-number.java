class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[j]){
                return nums[i];
            }
            j++;
        }
        return 0;
    }
}