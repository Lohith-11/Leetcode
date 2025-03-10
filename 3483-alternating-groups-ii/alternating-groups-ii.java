class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        List<Integer> arr = new ArrayList<>();
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            arr.add(colors[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            arr.add(colors[i]);
        }
        int ans = 0;
        int i = 0;
        int j = 1;
        while (j < arr.size()) {
            if ((arr.get(j) != arr.get(j - 1)) && j - i + 1 <= k) {
                if(j-i+1==k){
                    ans++;
                    i++;
                    j++;
                }else{
                    j++;
                }
            } else if (arr.get(j) == arr.get(j - 1)) {
                i = j;
                j++;
            }
        }
        System.out.println(arr);
        return ans;
    }
}