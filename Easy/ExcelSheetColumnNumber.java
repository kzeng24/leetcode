/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
ZY -> 701
*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            int val = ch - 64;
            sum += val * Math.pow(26, columnTitle.length() - 1 - i);
        }
        return sum;
    }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 42.4 MB, less than 77.67% of Java online submissions for Excel Sheet Column Number. */
