/* Problem:

The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement. */

class Solution {
    public int findComplement(int num) {
        int remainder = 0;
        int answer = 0;
        int count = 0;
        while (num > 0) {
            remainder = num % 2;
            if (remainder == 0) {
                answer = answer + (int) Math.pow(2, count);
            }
            num /= 2;
            count += 1;
        }
        return answer;
    }
}
