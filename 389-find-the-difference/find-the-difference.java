class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char d=t.charAt(i);
            if(map2.containsKey(d)){
                map2.put(d,map2.get(d)+1);
            }else{
                map2.put(d,1);
            }
        }
        for(char key:map2.keySet()){
            if(map1.containsKey(key) && map1.get(key)==map2.get(key)){
                continue;
            }else{
                return key;
            }
        }
        return 'a';
    }
}