class Solution {
    public int countAsterisks(String s) {
        int countPair=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                countPair++;
            }
            if(countPair%2==0){
                if(s.charAt(i)=='*'){
                    ans++;
                }
            }
        }
        return ans;
    }
}