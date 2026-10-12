class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
     int count = Integer.MAX_VALUE;
       
        for(int i=0; i<nums.length; i++){
             int sum = 0, j = i;
            while(j<nums.length){
                sum+=nums[j];
                if(sum>=target){
                    count = Math.min(count, j-i+1);
                    break;
                }
                j++;
            }
        }

        return count == Integer.MAX_VALUE ? 0: count;
    }
}