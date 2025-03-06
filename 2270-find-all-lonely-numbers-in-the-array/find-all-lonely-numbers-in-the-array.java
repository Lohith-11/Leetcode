class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==1 && !map.containsKey(key+1) && !map.containsKey(key-1)){
                ans.add(key);
            }
        }
        return ans;
    }
}