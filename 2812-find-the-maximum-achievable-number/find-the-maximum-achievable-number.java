class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int ans=0;
        for(int i=0;i<=t;i++){
            ans=num+(t*2);
        }
        return ans;        
    }
}