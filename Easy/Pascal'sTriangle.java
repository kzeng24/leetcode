/* Problem:
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown: */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<Integer>();  
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    }
                    else {
                        List<Integer> prevList = answer.get(i-1);
                        row.add(prevList.get(j-1) + prevList.get(j));
                    }
                }
            answer.add(row);
        }
        return answer;
    }
}
