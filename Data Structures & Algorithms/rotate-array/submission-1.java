class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        int count = 0;
        for (int start = 0; count<n; start++){
            int current = start;
            int pre = nums[start];
            do{
                int idx = (current + k) % n;
                int tmp = nums[idx];
                nums[idx] = pre;
                pre = tmp;
                current = idx;
                count ++;

            }while(start!=current);
        }
    }
}