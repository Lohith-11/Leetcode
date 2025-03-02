class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder("");
        int x=1;
        char ans=word.charAt(0);
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==ans && x<9){
                x++;
            }else{
                sb.append(x).append(ans);
                ans=word.charAt(i);
                x=1;
            }
        }
        sb.append(x).append(ans);
        return sb.toString();
    }
}