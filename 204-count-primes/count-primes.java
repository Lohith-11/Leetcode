class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int count=0;
        int[] ans=new int[n];
        for(int i=2;i<n;i++){
            if(ans[i]==0){
                count++;
                for(int j=i*2;j<n;j+=i){
                    ans[j]=1;
                }
            }
        }
        return count;
    }
}