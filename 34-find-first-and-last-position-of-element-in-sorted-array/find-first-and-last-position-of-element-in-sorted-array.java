class Solution {
    public int lastPos(int[] nums, int target){
        int z=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                z=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return z;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int x=-1;
        int y=lastPos(nums,target);
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                x=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        System.out.println(x);
        System.out.println(y);
        ans[0]=x;
        ans[1]=y;
        return ans;
    }
}