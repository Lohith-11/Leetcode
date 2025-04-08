class Solution {
    public int fun(int[] nums,int k){
        int n=nums.length;
        int x=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int y=0; y<n;y++){
            if(map.containsKey(nums[y])){
                map.put(nums[y],map.get(nums[y])+1);
            }else{
                map.put(nums[y],1);
            }

            while(map.size()>k){
                map.put(nums[x],map.get(nums[x])-1);
                if(map.get(nums[x])==0){
                    map.remove(nums[x]);
                }
                x++;
            }
            ans+=y-x+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
}