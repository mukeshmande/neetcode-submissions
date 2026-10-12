class Solution {
    public int[] sortArray(int[] nums) {
      boolean swaps = true;
    while(swaps){
      swaps = false;
      for(int i = 0; i < nums.length-1; i++){
        if(nums[i] > nums[i+1]) {
          swap(nums, i, i+1);
          swaps = true;
        }
      }
    }
    return nums;

    }
      private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}