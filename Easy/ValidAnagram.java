/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arrCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int indexS = s.charAt(i) - 'a';
            arrCount[indexS] += 1;
            int indexT = t.charAt(i) - 'a';
            arrCount[indexT] -= 1;
        }
        for (int num : arrCount) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
