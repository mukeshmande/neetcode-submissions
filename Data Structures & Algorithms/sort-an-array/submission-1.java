class Solution {
    public int[] sortArray(int[] nums) {
         int largest = -50000;
    int indexLargest = 0;
    int index = nums.length - 1;

    for(int j=0;j<=index;){
      int i = 0;
      while ( i <= index) {
        if(nums[i] > largest) {
          largest = nums[i];
          indexLargest = i;
        }
        i++;
      }
      swap(nums, index, indexLargest);
      index--;
      largest = -50000;
    }
    return nums;

    }
      private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}