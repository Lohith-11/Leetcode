class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double ans=Integer.MIN_VALUE;
        avg=sum/k;
        ans=Math.max(ans,avg);
        int x=1;
        int y=x+k-1;
        while(y<nums.length){
            double a=nums[x-1];
            double b=nums[y];
            double c=((b-a)/k);
            avg=avg+c;
            ans=Math.max(avg,ans);
            y++;
            x++;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        return ans;
    }
}