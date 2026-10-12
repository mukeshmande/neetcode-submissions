class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1, maxArea = 0, high = 0;

        while(l<r){
            high = Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, high * (r-l) );

            while(l<r && heights[l] <= high) l++;
            while(l<r && heights[r] <= high) r--;
        }
        return maxArea;

    }
}
