class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        while(!str.isEmpty()){
            String len = str.substring(0, str.indexOf("#"));
            int strLen = Integer.parseInt(len);
            res.add(str.substring(len.length()+1, len.length()+strLen+1));
            str = str.substring(len.length()+strLen+1);
        }
        

        return res;

    }
}
