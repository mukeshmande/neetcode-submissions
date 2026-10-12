class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r = 0, sum =0, count = Integer.MAX_VALUE;

        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                count = Math.min(count, r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}