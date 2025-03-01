class Solution {
    public String reverseVowels(String s) {
        List<Character> ans=new ArrayList<>();
        ans.add('A');
        ans.add('E');
        ans.add('I');
        ans.add('O');
        ans.add('U');
        ans.add('a');
        ans.add('e');
        ans.add('i');
        ans.add('o');
        ans.add('u');
        char[] arr=s.toCharArray();
        int j=arr.length-1;
        int i=0;
        if(s.length()<=1){
            return s;
        }
        while(i<j){
            if(!ans.contains(arr[i])){
                i++;
            }
            if(!ans.contains(arr[j])){
                j--;
            }
            if(ans.contains(arr[i]) && ans.contains(arr[j])){
                char temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(int k=0;k<arr.length;k++){
            sb.append(arr[k]);
        }
        return sb.toString();
    }
}