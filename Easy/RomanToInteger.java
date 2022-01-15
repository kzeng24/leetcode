/* Problem: Given a roman numeral, convert it to an integer. */

class Solution {
    
    public Map<String, Integer> createKeyMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        return map;
    }
    
       public Map<String, String> createPrevMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("V", "I");
        map.put("X", "I");
        map.put("L", "X");
        map.put("C", "X");
        map.put("D", "C");
        map.put("M", "C");
        return map;
    }

    public int romanToInt(String s) {
        int sum = 0;
        String prev = "";
        String[] array = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if (prev.equals(this.createPrevMap().get(array[i]))) {
                sum -= 2*this.createKeyMap().get(prev);
            }
            sum += this.createKeyMap().get(array[i]);
            prev = array[i];
        }
        return sum;
    }
}
