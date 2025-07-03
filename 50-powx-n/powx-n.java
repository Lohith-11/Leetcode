class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        int first=n;
        if(n<0){
            n=-1*n;
        }
        while(n>0){
            if(n%2==0){
                x=x*x;
                n=n/2;
            }else{
                ans=ans*x;
                n=n-1;
            }
        }
        if(first==-2147483648 && x!=1.0 && x!=-1.0){
            return (double) 0;
        }
        if(first<0){
            return (double)(1.0)/ans;
        }
        return ans;   
    }
}