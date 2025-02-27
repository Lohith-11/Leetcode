class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='U'){
                a++;
            }else if(c=='D'){
                a--;
            }else if(c=='L'){
                b++;
            }else{
                b--;
            }
        }
        return (a==0 && a==b);
    }
}