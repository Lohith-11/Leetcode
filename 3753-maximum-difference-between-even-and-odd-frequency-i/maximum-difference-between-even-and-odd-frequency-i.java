class Solution {
    public int maxDifference(String s) {
        HashMap <Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int odd=0;
        int even=101;
        for(char key:map.keySet()){
            int x=map.get(key);
            if(x%2!=0 && x>=odd){
                odd=x;
            }else if(x%2==0 && x<=even){
                even=x;
            }
        }
        return odd-even;
    }
}