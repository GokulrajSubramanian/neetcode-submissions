class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stack = new Stack<>();
        int maxArea=0;
        for(int idx=0; idx<=heights.length; idx++){
            int currentHeight = (idx==heights.length)? 0: heights[idx];
            while(!stack.isEmpty() && currentHeight<heights[stack.peek()]){

                int poppedIdx = stack.pop();
                int height = heights[poppedIdx];
                int width;
                if(stack.isEmpty()){
                    width = idx;
                }else{
                    width = idx - stack.peek()-1;
                }
                int area = height*width;
                maxArea = Math.max(maxArea, area);
            }
            if(idx<heights.length){
                stack.push(idx);
            }
        }
        return maxArea;
    }
}
