class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, nums, target, new ArrayList<>(), ans);
        return ans;
    }

    public void findCombination(int i, int[] nums, int target, List<Integer> ds, List<List<Integer>> ans){
            if(i == nums.length){
                if(target == 0){
                    ans.add(new ArrayList<>(ds));
                }
                return;
            }

            if(nums[i] <= target){
                ds.add(nums[i]);
                findCombination(i, nums, target - nums[i], ds, ans);
                ds.remove(ds.size() - 1);
            }

            findCombination(i+1, nums, target, ds, ans);
    }
}
