class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for(int num: nums){
            l = Math.max(l, num);
            r += num;
        }

        while(l<r){
            int mid = l + (r-l)/2;
            if(canSplit(nums, k, mid)){
                r = mid;
            }else{
                l = mid+1;
            }

        }
        return r;
    }

    public boolean canSplit(int[] nums, int k, int largest){
        int subArray = 1, curSum = 0;
        for(int num: nums){
            curSum += num;
            if(curSum > largest){
                subArray++;
                if(subArray > k) return false;
                curSum = num;
            }

        }
        return true;
    }
}