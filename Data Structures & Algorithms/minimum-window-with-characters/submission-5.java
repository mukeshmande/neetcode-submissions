class Solution {
    public String minWindow(String s, String t) {
        
        int[] map = new int[128];
        int count = t.length();
        for(char ch : t.toCharArray()){
            map[ch]++;
        }
        int start=0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE;

        while(end < s.length()){
            if(map[s.charAt(end)] > 0){
                count--;
            }
            map[s.charAt(end)]--;
            end++;
            while(count == 0){
                if(end - start < minLen){
                    minLen = end-start;
                    minStart = start;
                }
                if(map[s.charAt(start)] == 0){
                    count++;
                }
                map[s.charAt(start)]++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+minLen);

    }
}
