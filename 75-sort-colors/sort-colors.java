class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }else{
                two++;
            }
        }        
        int x=0;
        while(zero>0){
            nums[zero-1]=0;
            zero--;
            x++;
        }
        int y=x;
        while(one>0){
            nums[one+x-1]=1;
            one--;
            y++;
        }
        int z=y;
        while(two>0){
            nums[two+z-1]=2;
            two--;
        }
    }
}