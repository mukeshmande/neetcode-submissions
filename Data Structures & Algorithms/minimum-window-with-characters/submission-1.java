class Solution {
    public String minWindow(String s, String t) {
         int min = Integer.MAX_VALUE;
      String res = "";
      // Convert char[] to Character[] first
      String[] characterObjectArray = new String[t.length()];
      for (int i = 0; i < t.length(); i++) {
          characterObjectArray[i] = t.charAt(i)+"";
      }

      for(int l=0; l<s.length(); l++){
          List<String> ch = new ArrayList<>(Arrays.asList(characterObjectArray));
          int r = l, count = 0;
          while(r<s.length() && !ch.isEmpty()){
              if(ch.contains(s.charAt(r)+"")){
                  count++;
                  ch.remove(s.charAt(r)+"");
              }
              r++;
          }
          if(r-l<min && ch.isEmpty()){
              res = s.substring(l, r);
               min = res.length();
          }

      }
        return res;
    }
}
