class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str).append("_#_");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        while(str.length() > 0 ){
            String tmp = str.substring(0, str.indexOf("_#_"));
            result.add(tmp);
            str = str.substring(str.indexOf("_#_") + 3, str.length());
        }

        return result;

    }
}
