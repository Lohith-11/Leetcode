class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',0);
        map.put('b',0);
        map.put('c',0);

        int i=0;
        int count=0;
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            map.put(ch,map.get(ch)+1);
            while(map.get('a')>0 && map.get('b')>0 && map.get('c')>0){
                count=count+s.length()-j;
                char ch2=s.charAt(i);
                map.put(ch2,map.get(ch2)-1);
                i++;
            }
        }
        return count;
    }
}