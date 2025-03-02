class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<order.length();j++){
            char b=order.charAt(j);
            while(map.containsKey(b) && map.get(b)>0){
                sb.append(b);
                map.put(b,map.get(b)-1);
                if(map.get(b)==0){
                    map.remove(b);
                }
            }
        }
        for(char key:map.keySet()){
            while(map.get(key)>0){
            sb.append(key);
            map.put(key,map.get(key)-1);

            }
        }
        return sb.toString();
    }
}