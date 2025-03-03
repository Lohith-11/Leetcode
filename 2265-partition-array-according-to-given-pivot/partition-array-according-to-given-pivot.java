class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] ans=new int[n];
        List<Integer> s=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        List<Integer> g=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                s.add(nums[i]);
            }else if(nums[i]>pivot){
                g.add(nums[i]);
            }else{
                l.add(nums[i]);
            }
        }
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        for(int i=0;i<s.size();i++){
            ans[l.size()+i]=s.get(i);
        }
        for(int i=0;i<g.size();i++){
            ans[l.size()+s.size()+i]=g.get(i);
        } 
        return ans;
    }
}