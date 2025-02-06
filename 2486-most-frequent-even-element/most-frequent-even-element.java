class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        int ans=Integer.MAX_VALUE;
        int count=0;
        for(int key: map.keySet()){
            if(key%2==0){
                max=Math.max(max,map.get(key));
                count++;
            }
        }
        System.out.println(max);
        for(int key: map.keySet()){
            if(map.get(key)==max && key%2==0){
                ans=Math.min(key,ans);
            }
        }
        if(count==0){
            return -1;
        }
        return ans;
    }
}