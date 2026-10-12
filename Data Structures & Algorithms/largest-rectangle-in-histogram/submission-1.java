class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pre = new int[n];
        int[] next = new int[n];
        Arrays.fill(pre, -1);
        Arrays.fill(next, n);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                int index= stack.pop();
                next[index] = i;
            }

            if(!stack.isEmpty()){
                pre[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i<n; i++){
            int width = next[i] - pre[i] - 1;
            maxArea = Math.max(maxArea, heights[i] * width);
        }

        return maxArea;
    }
}
