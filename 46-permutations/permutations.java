class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int[] arr=new int[nums.length];
        Arrays.fill(arr,0);
        helper(ans,temp,arr,nums);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> temp,int[] arr,int nums[]){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(arr[i]==1){
                continue;
            }
            temp.add(nums[i]);
            arr[i]=1;
            helper(ans,temp,arr,nums);
            temp.remove(temp.size()-1);
            arr[i]=0;
        }
    }
}