class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }else if(c==')'){
                if(!s.isEmpty() && s.peek()=='(') s.pop(); 
                else return false;
            }else if(c=='}'){
                if(!s.isEmpty() && s.peek()=='{') s.pop();
                else return false;
            }else if(c==']'){
                if(!s.isEmpty() && s.peek()=='[') s.pop();
                else return false;
            }
        }
        return s.isEmpty();
    }
}