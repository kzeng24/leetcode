/* Problem:
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array. */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int curMaxSum = nums[0];
        for (int val : nums) {
            sum += val;
            curMaxSum = Math.max(curMaxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return curMaxSum;
    }
}

class Solution2 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int curMaxSum = nums[0];
        int curMaxVal = nums[0];
        for (int val : nums) {
            if (sum + val < 0) {
                sum = 0;
            }
            else {
                sum += val;
            }
            curMaxSum = Math.max(curMaxSum, sum);
            curMaxVal = Math.max(curMaxVal, val);
        }
        if (curMaxSum == 0) {
            return curMaxVal;
        }
        return curMaxSum;
    }
}
