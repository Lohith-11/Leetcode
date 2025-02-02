class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sol=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            int ans=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    ans++;
                }
            }
            sol[x]=ans;
            x++;
        }
    return sol;
    }
}