class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            int val=target-nums[i];
            if(map.containsKey(val) && map.get(val)!=i){
                ans[0]=i;
                ans[1]=map.get(val);
                return ans;
            }
        }
        System.out.println(map);
        return ans;
    }
}