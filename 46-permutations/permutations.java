class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int[] check=new int[nums.length];
        Arrays.fill(check,0);
        helper(ans,temp,nums,check);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> temp,int[] nums,int[] check){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(check[i]==1){
                continue;
            }
            check[i]=1;
            temp.add(nums[i]);
            helper(ans,temp,nums,check);
            check[i]=0;
            temp.remove(temp.size()-1);
        }
    }
}