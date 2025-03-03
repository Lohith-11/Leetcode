class Solution {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        int count=0;
        for(int i=0;i<boxes.length();i++){
            int a=boxes.charAt(i)-'0';
            for(int j=0;j<boxes.length();j++){
                int b=boxes.charAt(j)-'0';
                if(b==1){
                count+=Math.abs(i-j);
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}