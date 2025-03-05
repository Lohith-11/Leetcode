class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int[] ans=new int[n];
        for(int i=2;i*i<n;i++){
            if(ans[i]==0){
                for(int j=i*i;j<n;j+=i){
                    ans[j]=1;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(ans[i]==0){
                count++;
            }
        }
        return count;
    }
}