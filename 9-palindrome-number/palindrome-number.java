class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int real=x;
            long ans=0;
            while(x!=0){
                int rem=x%10;
                ans+=rem;
                ans*=10;
                x/=10;
            }
            ans/=10;
            if(ans==real){
                return true;
            }else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }
}