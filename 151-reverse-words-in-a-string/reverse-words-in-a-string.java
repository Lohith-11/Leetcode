class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals("")){             
            ans.append(arr[i]);
            ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}