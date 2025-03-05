class Solution {
    public String removeOccurrences(String s, String part) {
        int ans=s.indexOf(part);
        int n=part.length();
        while(ans != -1){
            int m=s.length();
            String a=s.substring(0,ans);
            String b=s.substring(ans+n,m);
            s="";
            s=a;
            s+=b;
            ans=s.indexOf(part);
        }
        System.out.println(ans);
        return s;     
    }
}