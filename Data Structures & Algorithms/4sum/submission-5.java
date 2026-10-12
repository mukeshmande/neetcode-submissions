class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res  = new HashSet<>();
        Arrays.sort(nums);
        for(int a=0; a<nums.length; a++){
            for(int b=a+1; b<nums.length; b++){
                for(int c=b+1; c<nums.length; c++){
                    for(int d=c+1; d<nums.length; d++){
                        if(0L + nums[a] + nums[b] + nums[c] + nums[d] == target){
                            res.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        }
                    }
                }
            }   
        }

        return new ArrayList<>(res);
    }
}