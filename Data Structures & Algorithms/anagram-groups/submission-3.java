class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] count = new int[26];
            for(char ch: str.toCharArray()){
                count[ch - 'a']++;
            }
            String sortedStr = Arrays.toString(count);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
