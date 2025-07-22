// Last updated: 7/22/2025, 11:45:30 AM
class Solution {
    public boolean hasSameDigits(String s) {
        String ans="";
        while(s.length()>2){
        for(int i=0;i<s.length()-1;i++){
            int x=(int) s.charAt(i)-48;
            int y=(int) s.charAt(i+1)-48;
            int temp=(x+y)%10;
            ans+=Integer.toString(temp);            
        }
        s=ans;
        ans="";
        }
        int a=(int) s.charAt(0)-48;
        int b=(int) s.charAt(1)-48;
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}