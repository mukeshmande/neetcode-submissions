class Solution {
    public boolean checkInclusion(String s1, String s2) {
       char[] s1Array = s1.toCharArray();
      Arrays.sort(s1Array);

      Arrays.sort(s1Array);

      String sortedS1 = new String(s1Array);


      int l=0, r = sortedS1.length();
      while(r<=s2.length()){

          char[] s2Array = s2.substring(l, r).toCharArray();
          Arrays.sort(s2Array);
          String sortedS2 = new String(s2Array);
            if(sortedS1.equals(sortedS2)){
                return true;
            }

            l++;
            r++;
        }

        return false;
    }
}
