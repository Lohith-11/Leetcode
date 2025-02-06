class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int x=sum-k;
            if(map.containsKey(x)){
                ans+=map.get(x);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return ans;
        
    }
}