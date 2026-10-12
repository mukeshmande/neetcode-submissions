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
            String strLen = str.substring(0, str.indexOf('#'));
            int len = Integer.parseInt(strLen);
            res.add(str.substring(strLen.length()+1, strLen.length()+1+len));
            str = str.substring(strLen.length()+1+len);
        }   

        return res;

    }
}
