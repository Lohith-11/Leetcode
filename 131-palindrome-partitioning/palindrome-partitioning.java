class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(s,temp,ans);
        return ans;
    }
    public void helper(String s,List<String> temp,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<s.length();i++){
            String part=s.substring(0,i+1);
            if(isPalindrome(part)){
                temp.add(part);
                helper(s.substring(i+1),temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean isPalindrome(String part){
        int start=0;
        int end=part.length()-1;
        while(start<=end){
            if(part.charAt(start)!=part.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}