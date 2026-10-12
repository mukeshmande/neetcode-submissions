class Solution {
    int i = 0;
    public String decodeString(String s) {
        return decode(s);
    }

    public String decode(String s){
        StringBuilder res = new StringBuilder();
        int k = 0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                k = k * 10 + (c - '0');
            }else if(c == '['){
                i++;
                String subRes  = decode(s);
                while(k-- > 0) res.append(subRes);
                k=0;
            }else if(c == ']'){
                return res.toString();
            }else {
                res.append(c);
            }
            i++;

        }
        return res.toString();
    }
}