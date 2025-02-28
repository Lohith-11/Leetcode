class Solution {
    public String capitalizeTitle(String title) {
        String[] ans=title.split(" ");
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<ans.length;i++){
            if(ans[i].length()>=3){
                char c=Character.toUpperCase(ans[i].charAt(0));
                String x=ans[i].substring(1,ans[i].length()).toLowerCase();
                sb.append(c);
                sb.append(x);
                sb.append(" ");
            }else{
                String y=ans[i].toLowerCase();
                sb.append(y);
                sb.append(" ");
            }
        }
        return sb.toString().trim(); 
    }
}