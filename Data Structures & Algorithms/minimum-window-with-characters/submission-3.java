class Solution {
    public String minWindow(String s, String t) {
         int min = Integer.MAX_VALUE;
        String res = "";
        String[] charArray = new String[t.length()];
        for(int i = 0; i<t.length(); i++){
            charArray[i] = t.charAt(i) + "";
        }

        for(int l=0; l< s.length(); l++){
            List<String> list = new ArrayList<>(Arrays.asList(charArray));
            int r = l;
            while(r<s.length() && !list.isEmpty()){
                if(list.contains(s.charAt(r)+"")){
                    list.remove(s.charAt(r)+"");
                }
                r++;
            }

            if(r-l < min && list.isEmpty()){
                res = s.substring(l, r);
                min = r-l;
            }

        }
        return res;




    }
}
