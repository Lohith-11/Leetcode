class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        String x=s.toLowerCase();
        while(i<j){
            if(!Character.isLetterOrDigit(x.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(x.charAt(j))){
                j--;
                continue;
            }
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        System.out.print(x.charAt(0)-0);
        return true;
    }
}