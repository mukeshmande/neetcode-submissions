class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[k]);
                        res.add(item);
                    }
                }
            }
        }
        return new ArrayList<>(res);
        

    }
}
