class Solution {
    public int subarraySum(int[] nums, int k) {
        int seqCount = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int num: nums){
            prefixSum += num;
            int diff = prefixSum -k;
            seqCount += map.getOrDefault(diff, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
    return seqCount;
    }
}