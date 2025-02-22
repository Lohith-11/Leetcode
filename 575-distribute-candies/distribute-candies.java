class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=candyType.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(candyType[i])){
                map.put(candyType[i],map.get(candyType[i])+1);
            }else{
                map.put(candyType[i],1);
            }
        }
        if(map.size()>=n/2){
            return n/2;
        }else{
            return map.size();
        }

    }
}