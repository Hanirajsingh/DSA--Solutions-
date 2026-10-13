class Solution {
    boolean helper (String s, int i,int j){
        int n = s.length();
        if (i >= j) return true;

        if (!Character.isLetterOrDigit(s.charAt(i))) return helper(s, i+1,j);

        if (!Character.isLetterOrDigit(s.charAt(j))) return helper(s, i, j-1);

        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;

        return helper(s,i+1,j-1);

    }
    public boolean isPalindrome(String s) {

        return helper(s,0,s.length()-1);
        
    }
}