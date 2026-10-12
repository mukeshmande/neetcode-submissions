class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int longest = 0;

        for (int num: nums){
            if(!set.contains(num-1)){
                int currentStreak = 1;
                int curr = num+1;
                while(set.contains(curr)){
                currentStreak++;
                curr++;
                }
            longest = Math.max(currentStreak, longest);
            }

        }
      
        return longest;
    }
}
