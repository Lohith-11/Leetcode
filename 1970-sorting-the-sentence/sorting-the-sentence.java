class Solution {
    public String sortSentence(String s) {
        String[] sen=s.split(" ");
        String[] ans=new String[sen.length];
        for(int i=0;i<sen.length;i++){
            String y=sen[i];
            int x=(int) y.charAt(y.length()-1)-48;
            String z=Integer.toString(x);
            ans[x-1]=sen[i].replace(z,"");
            System.out.println(x);
        }
        String a="";
        for(int i=0;i<ans.length;i++){
            a+=ans[i];
            a+=" ";
        }

        return a.trim(); 
    }
}