/* Problem: 

In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise. */

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] counts = new int[n+1];
        // loop through the 'trust' array
        for (int i = 0; i < trust.length; i++) {
            counts[trust[i][0]] -= 1; // if a given person trust someone then decrement the count of his index
            counts[trust[i][1]] += 1; // increment the count of the index whom he trusts
        }
        // check if there is any index having count equals to n-1
        for (int j = 1; j < counts.length; j++){
            if (counts[j] == n-1){
                return j;
            }
        } 
        return -1;
    }
}

