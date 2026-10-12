class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        return s1.equalsIgnoreCase(reverseString(s1));
    }

    private String reverseString(String s){
        char[] sChars = s.toCharArray();

        int l=0, r=sChars.length-1;
        while(l<r){
            char tmp = sChars[l];
            sChars[l] = sChars[r];
            sChars[r] = tmp;
            l++;
            r--;
        }
        return String.valueOf(sChars);
    }
}
