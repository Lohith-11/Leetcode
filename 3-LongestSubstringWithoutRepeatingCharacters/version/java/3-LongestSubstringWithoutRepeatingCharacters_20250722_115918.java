// Last updated: 7/22/2025, 11:59:18 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                if(s.charAt(i)==s.charAt(j)){
                    set.remove(s.charAt(j));
                    i++;
                }else{
                    set.remove(s.charAt(i));
                    i++;
                }
            }else{
                set.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }
        }
        return max;
    }
}