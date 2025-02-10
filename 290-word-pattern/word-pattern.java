class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        // HashSet<Character> c=new HashSet<>();
        // HashSet<String> d=new HashSet<>();
        String[] x=s.split(" ");
        int y=0;
        if(pattern.length()!= x.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            // c.add(a);
            // d.add(x[i]);
            // if(c.size()!=d.size()){
            //     return false;
            // }
            String ans=x[i];
            if(map.containsKey(a)){
                if(!map.get(a).equals(ans)){
                    return false;
                }
                System.out.println(a);
            }else{
                if(map.containsValue(ans)){
                    return false;
                }
                map.put(a,x[i]);
            }
        }
        System.out.println(map);
        return true;    
    }
}