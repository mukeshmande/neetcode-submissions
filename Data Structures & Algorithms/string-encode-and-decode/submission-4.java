class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        while(!str.isEmpty()){
            String len = str.substring(0, str.indexOf("#"));
            int length = Integer.parseInt(len);
            list.add(str.substring(len.length() + 1, len.length() + 1 + length));
            str = str.substring(len.length() + 1 + length);
        }


        return list;
    }
}
