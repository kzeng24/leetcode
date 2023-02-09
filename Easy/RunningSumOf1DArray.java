/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = sumOfNums(nums, i);
        }
        return array;
    }

    public int sumOfNums(int[] nums, int index) {
        int sum = 0;
        for (int i = 0; i <= index; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
