class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int ans=nums[i]*nums[j];
                if(map.containsKey(ans)){
                    map.put(ans,map.get(ans)+1);
                }else{
                    map.put(ans,1);
                }
            }
        }
        int count=0;
        for(int key:map.keySet()){
            if(map.get(key)>=2){
                count+=map.get(key)*(map.get(key)-1)*2;
            }
        }
        return count*2;
    }
}