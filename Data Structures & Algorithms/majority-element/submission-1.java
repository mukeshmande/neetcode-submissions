class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        int majorElement = 0;
        int majorElementCount = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(majorElementCount < entry.getValue()){
                majorElement = entry.getKey();
                majorElementCount = entry.getValue();
            }
        }
        return majorElement;
    }
}