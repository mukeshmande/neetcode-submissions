class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }


        if(map.size()>2){
            Map<Integer, Integer> newMap = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() > 1){
                newMap.put(entry.getKey(), entry.getValue()-1);
                }
            }
            map = newMap;
        }    

        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int key: map.keySet()){
            int frequency = 0;
            for(int num: nums){
                if(key == num) frequency++;
            }
            if(frequency > n/3)
            res.add(key);

        }

        return res;
    }
}