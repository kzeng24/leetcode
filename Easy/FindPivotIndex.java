/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.*/

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        if (nums.length > 1) {
            for (int j = nums.length - 1; j > 0; j--) {
                rightSum += nums[j];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            // check pivot
            if (i-1>=0) {
                leftSum += nums[i-1];
            }
            if (leftSum == rightSum) {
                return i;
            }
            if (i+1<nums.length) {
                rightSum -= nums[i+1];
            }
        }
        return -1;
    }
}
