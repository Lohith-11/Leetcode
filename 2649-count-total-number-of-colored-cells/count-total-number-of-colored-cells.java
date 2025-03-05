class Solution {
    public long coloredCells(int n) {
        long add=1;
        long ans=1;
        while(n>1){
            ans=ans+add*4;
            add++;
            n--;
        }
        return ans;
    }
}