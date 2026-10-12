class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String word: strs){
            int[] count = new int[26];
            for(char c: word.toCharArray()){
                count[c - 'a']++;
            }
            String sortedWord = Arrays.toString(count);
            result.putIfAbsent(sortedWord, new ArrayList<>());
            result.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(result.values());
    }
}
