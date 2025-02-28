class Solution {
    public int compress(char[] chars) {
        int j=0;
        for(int i=0;i<chars.length;i++){
            char a=chars[i];
            int count=0;
            while(i<chars.length && chars[i] == a){
                count++;
                i++;
            }
            if(count==1){
                chars[j++]=a;
            }else{
                chars[j++]=a;
                for(char digit:Integer.toString(count).toCharArray()){
                    chars[j++]=digit;
                }
            }
            i--;
        }
        return j;
    }
}