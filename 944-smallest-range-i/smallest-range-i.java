class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
       }
       min+=k;
       int ans=max-min;
       System.out.println(ans);
       if(ans<0){
        return 0;
       }
       if(ans<=k && ans>=(-k)){
        if(ans>0){
            return 0;
        }
       }else{
        ans-=k;
       }
       return ans;
    }
}