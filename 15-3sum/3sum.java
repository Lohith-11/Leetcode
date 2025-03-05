class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> x=new ArrayList<>();
                    x.add(nums[i]);
                    x.add(nums[j]);
                    x.add(nums[k]);
                    ans.add(x);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }

            }
        }
        return ans;
    }
}