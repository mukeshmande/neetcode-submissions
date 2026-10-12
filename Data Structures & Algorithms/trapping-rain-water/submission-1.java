class Solution {
    public int trap(int[] height) {
        
         int res = 0, n=height.length-1;
      for(int i=0; i<=n; i++){
          int l=0, r = n;
          int gl=height[i], gr=height[i];

          while(l<i){
              gl = Math.max(gl,height[l++]);
          }
          while(r>i){
              gr = Math.max(gr,height[r--]);
          }

          res += Math.min(gl, gr)-height[i];

      }
        return res;
    }
}