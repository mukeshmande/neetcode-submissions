class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int num: nums){
            total += num;
            int diff = total - k;
            count += map.getOrDefault(diff, 0);
            map.put(total, map.getOrDefault(total, 0)+1);
        }
            return count;
    }
}