class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int[] leftMost = new int[n];
        int[] rightMost = new int[n];

        for(int i = 0; i<n; i++){
            leftMost[i] = -1;
            while(!stack.empty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(!stack.empty()){
              leftMost[i] =  stack.peek();
            }
            stack.push(i);
        }   

        stack.clear();

        for(int i = n-1; i>=0; i--){
            rightMost[i] = n;
            while(!stack.empty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(!stack.empty()){
                rightMost[i] = stack.peek();
            }
            stack.push(i);
        }     

        for(int i = 0; i<n; i++){
            leftMost[i] += 1;
            rightMost[i] -= 1;
            maxArea = Math.max(maxArea, heights[i] * (rightMost[i] - leftMost[i] + 1));
        }

        return maxArea;
    }
}
