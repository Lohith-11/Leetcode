class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=2;
        int count=0;
        List<Character> list=new ArrayList<>();
        while(j<s.length()){
            for(int k=i;k<=j;k++){
                if(!list.contains(s.charAt(k))){
                    list.add(s.charAt(k));
                }
            }
            // System.out.println(list);
            if(list.size()==1){
                sb.deleteCharAt(i-count);
                count++;
            }
            i++;
            j++;
            list.removeAll(list);
        }
        return sb.toString();
    }
}