class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int maxCount = 0;
        for(int i=0; i<s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                maxCount = Math.max(maxCount, j-i+1);
                set.add(s.charAt(j));
            }
        }
        

        return maxCount;


    }
}
