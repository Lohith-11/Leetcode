class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(nums,temp,ans,0);
        return ans;
    }
    public void helper(int[] nums,List<Integer> temp,List<List<Integer>> ans,int index){
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            helper(nums,temp,ans,i+1);
            temp.remove(temp.size()-1);
        }
    }
}