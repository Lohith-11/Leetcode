class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int l=k%nums.length;
        int j=n-l-1;
        for(int i=0;i<(n-l)/2;i++){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
        }
        int p=n-1;
        for(int i=(n-l);i<(2*n-l)/2;i++){
            int temp=nums[i];
            nums[i]=nums[p];
            nums[p]=temp;
            p--;
        }
        int q=n-1;
        for(int i=0;i<n/2;i++){
            int temp=nums[i];
            nums[i]=nums[q];
            nums[q]=temp;
            q--;
        }

    }
}