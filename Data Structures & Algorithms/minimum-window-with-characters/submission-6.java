class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int count = t.length();
        int[] map = new int[128];

        for(char ch: t.toCharArray()) map[ch]++;

        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        while(end < s.length()){
            if(map[s.charAt(end)] > 0){
                count--;
            }
            map[s.charAt(end)]--;
            end++;

            while(count == 0){
                if(minLen > end - start){
                    minLen = end - start;
                    minStart = start;
                }

                if(map[s.charAt(start)] == 0){
                    count++;
                }

                map[s.charAt(start)]++;
                start++;
            }

        } 


        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

    }
}
