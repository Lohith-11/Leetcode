class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> color=new HashMap<>();
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            if(map.containsKey(x)){
                int z=map.get(x);
                if(z==y){
                    arr[i]=color.size();
                    continue;
                }
                if(color.get(z) == 1){
                    color.remove(z);
                }else{
                color.put(z,color.get(z)-1);
                }
            }
            map.put(x,y);
            if(color.containsKey(y)){
                color.put(y,color.get(y)+1);
            }else{
                color.put(y,1);
            }
            arr[i]=color.size();
        }
        return arr;
    }
}