import java.util.Stack;

class Demo{
    public static void main(String[] args) {
        int [] heights = {6 , 2 , 5 , 4 , 5 , 1 , 6};
        int[] NSL = nearestSmallerToLeft(heights);
        int[] NSR = nearestSmallerToRight(heights);
        int maxArea = 0;
        for(int i = 0 ; i<heights.length;i++){
            int width = NSR[i] - NSL [i] -1 ;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea , area); 
        }
        System.out.println(maxArea);
    }

    public static int[] nearestSmallerToLeft(int[]heights){
        Stack<Integer>st = new Stack<>();
        int[]ans = new int[heights.length];
        for(int i =0;i<heights.length;i++){
            while (st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }

        st.push(i);
        }
        return ans;
    }

    public static int[] nearestSmallerToRight(int[]heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i = heights.length ; i>0 ; i--){
            while (!st.isEmpty() && ) {
                
            }
        }
    }

}