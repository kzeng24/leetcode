// Problem:
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int addingVal = target - nums[i];
            if (map.containsKey(addingVal)) {
                answer[0] = i;
                answer[1] = map.get(addingVal);
                break;
            }
            map.put(nums[i],i);
        }
        return answer;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int addingVal = target - nums[i];
            if (map.containsKey(addingVal) && i != map.get(addingVal)) {
                answer[0] = i;
                answer[1] = map.get(addingVal);
                break;
            }
        }
        return answer;
    }
}

class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}
