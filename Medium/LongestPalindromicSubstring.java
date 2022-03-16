/* Given a string s, return the longest palindromic substring in s. 

Ex.
Input: s = "cbbd"
Output: "bb"

*/

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return findLongestPalindrome(s);
        }
    }
    
    boolean isPalindrome(String s) {
        String[] array = s.split("");
        for (int i = 0; i < s.length() / 2; i++) {
            if (!array[i].equals(array[s.length() - 1 - i])) {
                return false;
            }
        }
        return true;
    }
    
    String findLongestPalindrome(String s) {
        String[] str = s.split("");
        String longestPalindrome = s.substring(0,1);
        for (int beg = 0; beg < str.length - 1; beg++) {
            for (int end = beg + 1; end < str.length; end++) {
                if (isPalindrome(s.substring(beg, end + 1)) 
                    && s.substring(beg, end + 1).length() > longestPalindrome.length()) {
                    longestPalindrome = s.substring(beg, end + 1);
                }
            }
        }
        return longestPalindrome;
    }
}
