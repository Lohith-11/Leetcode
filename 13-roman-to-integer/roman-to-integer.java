class Solution {
    public int romanToInt(String s) {
        int count=0;
        s=s.replace("CM","DCCCC");
        s=s.replace("CD","CCCC");
        s=s.replace("XC","LXXXX");
        s=s.replace("XL","XXXX");
        s=s.replace("IX","VIIII");
        s=s.replace("IV","IIII");
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                count+=1;
            }else if(s.charAt(i)=='V'){
                count+=5;
            }else if(s.charAt(i)=='X'){
                count+=10;
            }else if(s.charAt(i)=='L'){
                count+=50;
            }else if(s.charAt(i)=='C'){
                count+=100;
            }else if(s.charAt(i)=='D'){
                count+=500;
            }else if(s.charAt(i)=='M'){
                count+=1000;
            }
        }
        return count;
    }
}