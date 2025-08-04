class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] smallRight=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                smallRight[i]=n;
            }else{
                smallRight[i]=s.peek();
            }
            s.push(i);
        }
        int[] smallLeft=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                smallLeft[i]=-1;
            }else{
                smallLeft[i]=st.peek();
            }
            st.push(i);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int width=smallRight[i]-smallLeft[i]-1;
            int area=heights[i]*width;
            ans=Math.max(ans,area);
        }
        return ans;
    }
}