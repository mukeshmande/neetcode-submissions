class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            treeMap.putIfAbsent(e.getValue(), new ArrayList<>());
            treeMap.get(e.getValue()).add(e.getKey());
        }
        int[] result = new int[k];
        int i = 0;
        for(Map.Entry<Integer, List<Integer>> e: treeMap.entrySet()){
            for(int j: e.getValue()){
                result[i++] = j;
                if(i >= k) return result;
            }
        }

        return result;
    }
}
