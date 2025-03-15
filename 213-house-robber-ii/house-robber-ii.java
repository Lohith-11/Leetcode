class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            Arrays.sort(nums);
            return nums[n-1];
        }
        int[] pre1=new int[n-1];
        pre1[0]=nums[0];
        pre1[1]=Math.max(pre1[0],nums[1]);
        for(int i=2;i<n-1;i++){
            int count=nums[i]+pre1[i-2];
            pre1[i]=Math.max(count,pre1[i-1]);
        }
        int[] pre2=new int[n-1];
        pre2[0]=nums[1];
        pre2[1]=Math.max(pre2[0],nums[2]);
        for(int i=3;i<n;i++){
            int count=nums[i]+pre2[i-3];
            pre2[i-1]=Math.max(count,pre2[i-2]);
        }
        System.out.println(Arrays.toString(pre1));
        System.out.println(Arrays.toString(pre2));
        return Math.max(pre1[n-2],pre2[n-2]);
    }
}