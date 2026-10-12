class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        for(int num: nums){
            sum += num;
            int diff = sum - k;
            res += map.getOrDefault(diff, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

    return res;

    }
}