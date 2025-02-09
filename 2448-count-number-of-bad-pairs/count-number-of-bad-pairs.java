class Solution {
    public long countBadPairs(int[] nums) {
        long sum=0;
        long n=nums.length;
        long total=n*(n-1)/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-i)){
                map.put(nums[i]-i,map.get((nums[i]-i))+1);
            }else{
                map.put(nums[i]-i,1);
            }
        }
        System.out.println(map);
        for(int key: map.keySet()){
            if(map.get(key)>1){
                long val=map.get(key);
                sum+=(val)*(val-1)/2;
            }
        }
        return total-sum;
    }
}