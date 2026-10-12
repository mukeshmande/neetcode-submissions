class Solution {
    public int trap(int[] height) {
        int res = 0, n = height.length-1, l = 0, r = n;
        int leftMax = height[0], rightMax = height[n];
    
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax -height[r];
            }
        }

        return res;
    }
}
