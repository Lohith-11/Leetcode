class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char a='a';
        char b='b';
        char c='c';
        char d='d';
        int counter=0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                counter++;
                if(counter==1){
                    a=s1.charAt(i);
                    b=s2.charAt(i);
                }else if(counter ==2){
                    c=s1.charAt(i);
                    d=s2.charAt(i);
                }
            }
        }
        if(counter==0){
            return true;
        }else if(counter==2 && a==d && b==c){
            return true;
        }else{
            return false;
        }
    // return true;
    }
}