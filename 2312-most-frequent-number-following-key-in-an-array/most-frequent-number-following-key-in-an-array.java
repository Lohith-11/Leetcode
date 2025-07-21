class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
            }
        }
        int x=Integer.MIN_VALUE;
        int ans=0;
        for(int keys:map.keySet()){
            if(map.get(keys)>=x){
                x=map.get(keys);
                ans=keys;
            }
        }
        return ans;
    }
}