class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j=nums.length;
        int i = 0;
        while(i<j){
            if(nums[i] == val){
                nums[i] = nums[--j];
            }else {
                i++;
            }
        }
        return j;

    }
}