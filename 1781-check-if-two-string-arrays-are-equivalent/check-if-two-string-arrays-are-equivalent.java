class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x="";
        for(int i=0;i<word1.length;i++){
            x+=word1[i];
        }
        String y="";
        for(int i=0;i<word2.length;i++){
            y+=word2[i];
        }
        return (x.equals(y));
    }
}