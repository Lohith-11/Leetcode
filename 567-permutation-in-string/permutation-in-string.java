class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int[] ans1=new int[26];
        for(int i=0;i<m;i++){
            ans1[s1.charAt(i)-'a']++;
        }
        int n=s2.length();
        for(int i=0;i<n;i++){
            int a=0;
            int b=i;
            int[] ans2=new int[26];
            while(a<m && b<n){
                ans2[s2.charAt(b)-'a']++;
                a++;
                b++;
            }
            if(Arrays.equals(ans1,ans2)){
                return true;
            }
        }
        return false;
    }
}