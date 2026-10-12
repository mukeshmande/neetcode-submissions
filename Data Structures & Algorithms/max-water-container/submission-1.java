class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1;
        int mostWater = Integer.MIN_VALUE;
        while(l<r){
        mostWater = Math.max(mostWater, (r-l) * Math.min(heights[l], heights[r]));

            if(heights[r] > heights[l]){
                l++;
            }else {
                r--;
            }
        }

        return mostWater;

    }
}
