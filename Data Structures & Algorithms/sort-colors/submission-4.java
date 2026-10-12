class Solution {
    public void sortColors(int[] nums) {
           int i=0, l = 0, r = nums.length - 1;
        
        while(i<=r){
            if(nums[i] == 0) {
              int tmp = nums[l];
              nums[l] = nums[i];
              nums[i] = tmp;
              l++;
            } else if(nums[i] == 2) {
              int tmp = nums[r];
              nums[r] = nums[i];
              nums[i] = tmp;
              r--;
              i--;
            }
            i++;
        }

    }
}