class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            set.add(num);
            int ans=0;
            while(num>0){
                int rem=num%10;
                ans=ans*10+rem;
                num/=10;
            }
            set.add(ans);
        }
        return set.size();
    }
}