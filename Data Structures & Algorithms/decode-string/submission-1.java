class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> text = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int k = 0;

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10+(c - '0');
            }else if(c == '['){
                count.push(k);
                text.push(cur.toString());
                cur = new StringBuilder();
                k = 0;
            }else if(c == ']'){
                String tmp = cur.toString();
                int cnt = count.pop();
                cur = new StringBuilder(text.pop());
                for(int i = 0; i<cnt; i++){
                    cur.append(tmp);
                }
            }else{
                cur.append(c);
            }

        }

        return cur.toString();
    }
}