class Solution {
    public int longestConsecutive(int[] nums) {
          int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int num : nums){
            if(!set.contains(num-1)){
                int currentStreak = 1;
                int curr = num+1;
                while(set.contains(curr)){
                    currentStreak++;
                    curr++;
                }
                max = Math.max(max, currentStreak);
            }


        }
    return max;
    }
}
