class Solution {
    public int maximum69Number (int num) {
        String ans=Integer.toString(num);
        for(int i=0;i<ans.length();i++){
            String x=Integer.toString(ans.charAt(i)-48);
            if(x.equals("6")){
                ans=ans.replaceFirst("6","9");
                break;
            }
            System.out.println(x);
        }
        int y=Integer.parseInt(ans);
        return y;   
    }
}