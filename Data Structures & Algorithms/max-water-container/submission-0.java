class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int i=0, h =heights.length-1;
        while(i<h){
            maxArea = Math.max(maxArea, ((h-i) * Math.min(heights[i],heights[h])));
            if(heights[h]> heights[i]){
                i++;
            } else{
                h--;
            }
        }
        return maxArea;

    }
}
