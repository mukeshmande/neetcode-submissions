class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1, maxArea = Integer.MIN_VALUE;

        while(l<r){
            int maxHeight = Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, maxHeight * (r-l));
            if(heights[l] <= heights[r]){
                l++;
            }else r--;
        }
        return maxArea;
    }
}
