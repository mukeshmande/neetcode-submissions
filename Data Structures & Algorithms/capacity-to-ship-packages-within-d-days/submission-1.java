class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int w: weights){
            low = Math.max(low, w);
            high += w;
        }

        while(low<=high){
            int mid = low + (high - low)/2;
            if(shipAll(weights, days, mid)){
                high = mid - 1;
            }else low = mid + 1;
        }
        return low;
    }

    public boolean shipAll(int[] weights, int days, int capacity){
        int day = 1, sum = 0;
        for(int w: weights){
        
            if(sum + w > capacity){
                day++;
                sum = 0;
                if(day > days) return false;
            }
             sum+=w;
        }
        return true;

    }
}