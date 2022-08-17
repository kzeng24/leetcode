/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

class Solution2 {
    public int majorityElement(int[] nums) {
        List<Integer> uniqueVals = new ArrayList<Integer>();
        List<Integer> count = new ArrayList<Integer>();
        int index;
        int incVal;
        for (int i = 0; i < nums.length; i++) {
            if (uniqueVals.contains(nums[i])) {
                index = uniqueVals.indexOf(nums[i]);
                incVal = count.get(index) + 1;
                count.set(index, incVal);
            } else {
                uniqueVals.add(nums[i]);
                count.add(1);
            }
        }
        if (count.size() == nums.length) {
            return nums[0];
        }
        
        int maxCount = 0;
        int maxCountIndex = 0;
        for (int i = 0; i < count.size(); i++) {
            if (count.get(i) > maxCount) {
                maxCount = count.get(i);
                maxCountIndex = i;
            }
        }
        return uniqueVals.get(maxCountIndex);
    }
}
