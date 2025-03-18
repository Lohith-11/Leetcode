class Solution {
    public int longestNiceSubarray(int[] nums) {
       int bits=0;
       int start=0;
       int ans=0;
       for(int i=0;i<nums.length;i++){
        while((bits & nums[i])!=0){
            bits=bits ^ nums[start];
            start++;
        }
        bits=bits | nums[i];
        ans=Math.max(ans,i-start+1);
       } 
       return ans;
    }
}