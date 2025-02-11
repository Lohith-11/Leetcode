class Solution {
    public int rob(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums.length>2){
        ans[0]=nums[0];
        ans[1]=Math.max(nums[0],nums[1]);
        }else{
            Arrays.sort(nums);
            return nums[nums.length-1];
        }

        for(int i=2;i<nums.length;i++){
            int n=nums[i]+ans[i-2];
            if(n>ans[i-1]){
                ans[i]=n;
            }else{
                ans[i]=ans[i-1];
            }
        }
        System.out.println(Arrays.toString(ans));

        return ans[nums.length-1];
    }
}