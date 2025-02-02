class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean ans=true;
        if(nums.length==1){
            return ans;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i-1]%2==0){
                ans=false;
            }else if(nums[i]%2!=0 && nums[i-1]%2!=0){
                ans=false;
            }
        }
        return ans;
    }
}