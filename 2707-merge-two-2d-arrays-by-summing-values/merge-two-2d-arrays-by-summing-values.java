class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            int a=nums1[i][0];
            int b=nums1[i][1];
            map.put(a,b);
        }

        for(int i=0;i<nums2.length;i++){
            int c=nums2[i][0];
            int d=nums2[i][1];
            if(map.containsKey(c)){
                map.put(c,map.get(c)+d);
            }else{
                map.put(c,d);
            }
        }
        TreeMap<Integer,Integer> treeMap=new TreeMap<>(map);
        int[][] ans=new int[map.size()][2];
        int x=0;
        for(int key:treeMap.keySet()){
            ans[x][0]=key;
            ans[x][1]=treeMap.get(key);
            x++;
        }
        return ans;
    }
}