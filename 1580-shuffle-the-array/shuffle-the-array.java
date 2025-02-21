class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[n*2];
        int j=0;
        for(int i=0;i<n;i++){
            ans[j]=nums[i];
            j+=2;
        }
        int k=0;
        for(int i=n;i<n*2;i++){
            ans[k+1]=nums[i];
            k+=2;
        }
        return ans;
    }
}