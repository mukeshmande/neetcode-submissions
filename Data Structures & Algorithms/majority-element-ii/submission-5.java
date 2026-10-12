class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
            if(map.size() > 2){
                HashMap<Integer, Integer> newMap = new HashMap<>();
                for(Map.Entry<Integer, Integer> itr: map.entrySet()){
                    if(itr.getValue()>1){
                        newMap.put(itr.getKey(), itr.getValue()-1);
                    }
                }
                map = newMap;
            }
        

        List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()){
            int freq = 0;
            for(int num: nums){
                if(num == key){
                    freq++;
                }
            }
            if(freq > n/3) res.add(key);
        }
        return res;
    }
}