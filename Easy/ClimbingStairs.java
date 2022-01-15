/* Problem:
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? */

// --------------------
// dynamic programming:

// key idea: the total ways to get to the point [n] is n1 + n2. 
// Because from the [n-1] point, we can take one single step to reach [n]. 
// And from the [n-2] point, we could take two steps to get there.

class Solution {
    public int climbStairs(int n) {
        int[] opt = new int[n];
        opt[0] = 1;
        if (n >= 2) {
            opt[1] = 2;
            for (int i = 2; i < n; i++) {
                opt[i] = opt[i-1] + opt[i-2];
            }
        }
        return opt[n-1];
    }
}
