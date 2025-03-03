import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder("");
        int a=num1.length()-1;
        int b=num2.length()-1;
        int c=0;
        while(a>=0 || b>=0){
            int x;
            int y;
            if(a>=0){
                x=num1.charAt(a)-'0';
            }else{
                x=0;
            }
            if(b>=0){
                y=num2.charAt(b)-'0';
            }else{
                 y=0;
            }
            int sum=x+y+c;
            c=sum/10;
            sum%=10;
            sb.append(sum);
            sum=0;
            a--;
            b--;
        }
        if(c>0){
            sb.append(c);
        }
        return sb.reverse().toString();

    }
}