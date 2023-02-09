/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving 
the order of characters. No two characters may map to the same character, but a character may 
map to itself.*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<String, String> map = new HashMap<String, String>();
        String[] s1 = s.split("");
        String[] s2 = t.split("");
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s1[i])) {
                if (map.containsValue(s2[i])) {
                    return false;
                }
                map.put(s1[i], s2[i]);
            } else {
                if (!s2[i].equals(map.get(s1[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
