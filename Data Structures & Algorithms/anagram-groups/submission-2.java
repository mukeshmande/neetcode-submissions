class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            List<String> list = null;
            if(map.containsKey(sortedStr)){
                list = map.get(sortedStr);
            }else {
                list = new ArrayList<>();
            }
            list.add(str);
            map.put(sortedStr, list);
        }

        return new ArrayList<>(map.values());
    }
}
