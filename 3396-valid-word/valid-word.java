class Solution {
    public boolean isValid(String word) {
        word=word.toUpperCase();
        if(word.length()<3){
            return false;
        }
        int consonant=0;
        int vowel=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='A' || ch=='E' || ch=='I'||ch=='O'|| ch=='U'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                return false;
            }
        }
        if(vowel<1 || consonant<1){
            return false;
        }
        return true;

    }
}