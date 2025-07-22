// Last updated: 7/22/2025, 11:45:45 AM
class Solution {
    public int minOperations(int[] nums) {
        int j=2;
        int ans=0;
        while(j<nums.length){
            if(nums[j-2]!=1){
                for(int i=j-2;i<=j;i++){
                    if(nums[i]==1){
                        nums[i]=0;
                    }else{
                        nums[i]=1;
                    }
                }
            ans++;
            }
            j++;
        }
        Arrays.sort(nums);
        if(nums[0]==0){
            return -1;
        }else{
            return ans;
        }
    }
}