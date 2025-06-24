class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> val=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                val.add(i);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int v:val){
                if(Math.abs(i-v)<=k){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}