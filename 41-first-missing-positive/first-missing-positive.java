class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        TreeMap<Integer,Integer> set=new TreeMap<>(map);
        if(!set.containsKey(1)){
            return 1;
        }
        System.out.println(set);
        for(int key : set.keySet()){
            System.out.println(key);
            
            if(key>0 && !set.containsKey(key+1)){
                return key+1;
            }
        }
        return 1;
    }
}