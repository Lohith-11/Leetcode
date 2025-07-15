class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates,0,ans,temp,target);
        return ans;
    }
    public void helper(int[] candidates,int i,List<List<Integer>> ans,List<Integer> temp,int target){
        if(i==candidates.length || target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(candidates[i]);
        // helper(candidates,i+1,ans,temp,target-candidates[i]);
        helper(candidates,i,ans,temp,target-candidates[i]);
        temp.remove(temp.size()-1);
        helper(candidates,i+1,ans,temp,target);
    }
}