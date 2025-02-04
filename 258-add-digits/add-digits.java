class Solution {
    public int addDigits(int num) {
        while(num>9){
            int x=num%10;
            int y=num/10;
            num=x+y;
        }
        return num;
    }
}