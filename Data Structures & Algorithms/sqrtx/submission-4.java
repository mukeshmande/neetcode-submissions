class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int i = 1, res = 1;
        while(i <= x){
            if((long)i*i > x){
               return res;
            }
            res = i;
            i++;
        }
        return res;
    }
}