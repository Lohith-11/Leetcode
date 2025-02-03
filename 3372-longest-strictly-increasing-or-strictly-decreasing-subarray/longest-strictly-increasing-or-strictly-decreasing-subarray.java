class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int dec=1;
        int x=1;
        int y=1;
        if(nums.length==1){
            return x;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                x=Math.max(inc,x);
                dec=1;
            }else if(nums[i]<nums[i-1]){
                dec++;
                y=Math.max(dec,y);
                inc=1;
            }else{
                inc=1;
                dec=1;
            }
        }
        return Math.max(x,y);
    }
}