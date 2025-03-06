class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int count=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(j<i){
                break;
            }
            if(nums[i]==val && nums[j]!=val && i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                continue;
            }
            if(nums[j]==val && nums[i]!=val){
                j--;
            }
            if(nums[i]==val && nums[j]==val){
                i--;
                j--;
            }
        }
        return nums.length-count;
    }
}