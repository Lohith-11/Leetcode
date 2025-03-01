class Solution {
    public boolean rotateString(String s, String goal) {
        int i=0;
        StringBuilder sb=new StringBuilder(s);
        while(i<s.length()){
            char a=sb.charAt(0);
            sb.append(a);
            sb.deleteCharAt(0);
            if(sb.toString().equals(goal)){
                return true;
            }
            i++;
        }
        return false;
    }
}