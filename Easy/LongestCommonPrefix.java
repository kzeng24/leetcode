/* Problem:
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "". */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPref = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int minLength = Math.min(commonPref.length(), strs[i].length());
            while(minLength != 0) {
                if (commonPref.substring(0,minLength).equals(strs[i].substring(0,minLength))) {
                    commonPref = strs[i].substring(0,minLength);
                    break;
                }
                minLength -= 1;
            }
            if (minLength == 0) {
                return "";
            }
        }
        return commonPref;
    }
}
