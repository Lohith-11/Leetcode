class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(map1.containsKey(x)){
                map1.put(x,map1.get(x)+1);
            }else{
                map1.put(x,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char y=t.charAt(i);
            if(map1.containsKey(y)){
                map1.put(y,map1.get(y)-1);
            }else{
                map1.put(y,1);
            }
        }
        if(s.length()!=t.length()){
            return false;
        }
        for(Character key:map1.keySet()){
            if(map1.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}