/* Problem: 
Given a string s, find the length of the longest substring without repeating characters. */

// shorter solution
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        List<Character> list = new ArrayList<Character>();
        int maxCount = 0;
        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                int index = list.indexOf(c);
                for (int i = 0; i <= index; i++) {
                    list.remove(0);        
                }
            }
            list.add(c);
            maxCount = Math.max(maxCount, list.size());
        }
        return maxCount;
    }
}

// faster runtime
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        List<Character> list = new ArrayList<Character>();
        int maxCount = 0;
        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
            else {
                int index = list.indexOf(c);
                for (int i = 0; i <= index; i++) {
                    list.remove(0);        
                }
                list.add(c);
            }
            maxCount = Math.max(maxCount, list.size());
        }
        return maxCount;
    }
}
