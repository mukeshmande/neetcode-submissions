class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }

        for(int i=0; i<s.length(); i++){
            String newS = s.substring(0, i) + s.substring(i+1);
            if(isPalindrome(newS)){
                return true;
            }
        }
        return false;
    }

    private boolean isPalindrome(String s){
        int l=0, r = s.length() - 1;

        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}