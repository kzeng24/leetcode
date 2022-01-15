/* Problem:

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise. */

class Solution {
    public boolean isPalindrome(String s) {
        List<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                char ch = Character.toLowerCase(s.charAt(i));
                chars.add(ch);
            }
        }
        int middle = chars.size() / 2;
        int right = chars.size() - 1;
        for (int left = 0; left < middle; left++) {
            if (chars.get(left) != chars.get(right)) {
                return false;
            }
            right--;
        }
        return true;
    }
}
