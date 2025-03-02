class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder("");
        String vowels="aeiouAEIOU";
        String x="a";
        String[] str=sentence.split(" ");
        int n=str.length;
        for(int i=0;i<n;i++){
            char a=str[i].charAt(0);
            if(vowels.indexOf(a)==-1){
                for(int j=1;j<str[i].length();j++){
                    sb.append(str[i].charAt(j));
                }
                sb.append(a);
                sb.append("ma");
                sb.append(x);
                x+="a";
                sb.append(" ");
            }else{
                sb.append(str[i]);
                sb.append("ma");
                sb.append(x);
                x+="a";
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}