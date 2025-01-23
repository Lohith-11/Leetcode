class Solution {
    public int maxSubArray(int[] nums) {
        int negInt=0;
        int maxNegInt=Integer.MIN_VALUE;
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negInt++;
            }
            maxNegInt=Math.max(maxNegInt,nums[i]);
        }
        if(negInt==nums.length){
            return maxNegInt;
        }
        for(int i=0;i<nums.length;i++){
            currentSum=currentSum+nums[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;

        
    }
}