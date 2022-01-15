/*Problem:
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5. */

// binary search
class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        int mid = 0;
        int res = 1;
        while (left < right) {
            mid = left + (right - left)/2; //find new middle 
            if (mid > x/mid) {
                right = mid; // assign right boundary 
            } 
            else { // when mid is <= x/mid
                res = mid; // keep track of potential answer
                left = mid + 1; //assign left boundary
            }
        }
        return res; 
        // we don't return mid because our mid might be off in our last loop before left = right (because we shift left by 1 and right down to mid)
    }
}
