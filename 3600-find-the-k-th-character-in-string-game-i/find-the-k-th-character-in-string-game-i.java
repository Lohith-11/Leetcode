class Solution {
    public char kthCharacter(int k) {
        StringBuilder ans=new StringBuilder("a");
        while(ans.length()<k){
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<ans.length();i++){
                char c=ans.charAt(i);
                if(c=='z'){
                    sb.append('a');
                }else{
                    sb.append((char) (c+1));
                }
            }
            ans.append(sb);
        }
        System.out.println(ans);
        return ans.charAt(k-1);
    }
}