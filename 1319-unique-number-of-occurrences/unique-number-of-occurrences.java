class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean ans=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int count=0;
        List<Integer> y=new ArrayList<>();
        for(int key: map.keySet()){
            y.add(map.get(key));            
        }
        HashSet<Integer> x=new HashSet<>();
        for(int i=0;i<y.size();i++){
            x.add(y.get(i));
        }
        if(y.size()==x.size()){
            return true;
        }else{
            return false;
        }

        
    }
}