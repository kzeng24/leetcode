/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int[] count = new int[n];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int j = 0; j < n; j++) {
            if (count[j] == 0) {
                return j;
            }
        }
        return 0;
    }
}
