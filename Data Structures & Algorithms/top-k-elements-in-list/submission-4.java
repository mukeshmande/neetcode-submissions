class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            list.add(new int[]{e.getValue(), e.getKey()});
        }

        list.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = list.get(i)[1];
        }

        return result;
    }
}
