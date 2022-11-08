/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.*/

class Solution {
    public int firstUniqChar(String s) {
        char[] count = new char[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            count[index] += 1;
        }
        for (int j = 0; j < s.length(); j++) {
            int index2 = s.charAt(j) - 97;
            if (count[index2] == 1) {
                return j;
            }
        }
        return -1;
    }
}
