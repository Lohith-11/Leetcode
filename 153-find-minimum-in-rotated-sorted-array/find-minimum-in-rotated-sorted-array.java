class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        int ans=nums[0];
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[0]<=nums[mid]){
                start=mid+1;
            }else{
                ans=nums[mid];
                end=mid-1;
            }
        }
        return ans;
    }
}