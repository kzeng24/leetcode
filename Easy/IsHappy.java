/*A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/

class Solution {
    public boolean isHappy(int n) {
        if(n<10) {
            if(n==1||n==7) return true;
            else return false;
        }
        int b;int sum=0;
        while (n>0) {
             b=n%10;
             sum=sum+b*b; 
             n=n/10;
        } 
        return isHappy(sum);
    }
}

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
Memory Usage: 39.2 MB, less than 95.60% of Java online submissions for Happy Number.*/
