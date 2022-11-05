/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.*/

class Solution {
    public void reverseString(char[] s) {
        int middle = s.length / 2;
        for (int i = 0; i < middle; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}

/*Runtime: 1 ms, faster than 99.94% of Java online submissions for Reverse String.
Memory Usage: 54.1 MB, less than 72.23% of Java online submissions for Reverse String.
*/
