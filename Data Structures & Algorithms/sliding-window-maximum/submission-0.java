class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<k) return new int[0];
        int[] res = new int[nums.length-k+1];
        int l = 0;
        for(int i=0; i<nums.length-k+1; i++){
            int j = i;
            int max = Integer.MIN_VALUE;
            while(j<i+k){
                max = Math.max(max, nums[j]);
                j++;
            }   
             res[l++]= max;
        }
        
        return res;


    }
}
