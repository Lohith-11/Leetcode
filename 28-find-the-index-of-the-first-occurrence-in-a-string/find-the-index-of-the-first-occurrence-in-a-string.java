class Solution {
    public int strStr(String haystack, String needle) {
        int ans=needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<=haystack.length()-ans;i++){
            String x=haystack.substring(i,i+ans);
            System.out.println(x);
            if(x.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}