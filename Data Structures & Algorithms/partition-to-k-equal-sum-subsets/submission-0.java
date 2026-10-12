class Solution {
    boolean[] used;
    int target;
    int n;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if(sum % k != 0) return false;
        this.n = nums.length;
        this.target = sum /k;
        Arrays.sort(nums);
        for(int i = 0; i < n/2; i++){
            int tmp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = tmp;
        }

        used = new boolean[n];
        return backtrack(nums, k, 0, 0);
    }

    public boolean backtrack(int[] nums, int k, int currSum, int start){
        if(k == 0) return true;
        if(currSum == target){
            return backtrack(nums, k-1, 0, 0);
        }

        for(int i = start; i< n; i++){
            if( used[i] || nums[i] + currSum > target) continue;
            used[i] = true;
            if(backtrack(nums, k, currSum + nums[i], i+1)) return true;
            used[i] = false;

            if(currSum == 0){
                return false;
            }
        }

        return false;
    }

}