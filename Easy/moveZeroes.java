/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swapZero(nums, i, pos);
                pos++;
            }
        }
    }
    
    public void swapZero(int[] nums, int index, int pos) {
        int temp = nums[pos];
        nums[pos] = nums[index];
        nums[index] = temp;
    }
}

