class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        for(Integer num: set){
            if(!set.contains(num-1)){
                int len = 1;
                while(set.contains(num+len)){
                    len++;
                }
                max = Math.max(max, len);

            }
        }

        return max;
    }
}
