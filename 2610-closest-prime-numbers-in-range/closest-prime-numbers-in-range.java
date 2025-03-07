class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans=new int[right+1];
        ans[0]=1;
        ans[1]=1;
        for(int i=2;i*i<=right;i++){
            if(ans[i]==0){
                for(int j=i*i;j<=right;j+=i){
                    ans[j]=1;
                }
            }
        }
        int[] res={-1,-1};
        int prev=-1;
        int diff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(ans[i]==0 && prev!=-1){
                int x=i-prev;
                if(x<diff){
                    res[0]=prev;
                    res[1]=i;
                    diff=x;
                }
                System.out.println(x);
            }
            if(ans[i]==0){
                prev=i;
            }
            
        }
        return res;
    }
}