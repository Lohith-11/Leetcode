class Solution {
    public void nextPermutation(int[] nums) {
        int ans=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ans=i;
                break;
            }
        }
        if(ans==-1){
            int y=n-1;
            for(int i=0;i<=y;i++){
                int temp=nums[i];
                nums[i]=nums[y];
                nums[y]=temp;
                y--;
            }
            return;
        }
        for(int i=n-1;i>=ans;i--){
            if(nums[i]>nums[ans]){
                int temp=nums[i];
                nums[i]=nums[ans];
                nums[ans]=temp;
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+",");
        }
        // System.out.print(ans);
        int z=n-1;
        for(int i=ans+1;i<=z;i++){
            int temp=nums[i];
            nums[i]=nums[z];
            nums[z]=temp;
            z--;
        }        
    }
}