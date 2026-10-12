class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int L = Integer.MAX_VALUE, R = Integer.MIN_VALUE;
        for(int[] trip: trips){
            L = Math.min(L, trip[1]);
            R = Math.max(R, trip[2]);
        }
        int N = R - L + 1;
        int[] passchange = new int[N+1];
        for(int[] trip: trips){
            passchange[trip[1] - L] += trip[0];
            passchange[trip[2] - L] -= trip[0];
        }

        int currPass = 0;
        for(int change: passchange){
            currPass+=change;
            if(currPass > capacity) return false;
        }

        return true;
    }
}