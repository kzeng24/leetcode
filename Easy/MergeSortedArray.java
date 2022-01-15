/* Problem:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n. */

// building array from beginning to end
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newNums1 = new int[m];
        for (int i = 0; i < m; i++) {
            newNums1[i] = nums1[i];
        }
        int index1 = 0;
        int index2 = 0;
        int answerIndex = 0;
        while(index1 < m && index2 < n){
            if (newNums1[index1] <= nums2[index2]){
                nums1[answerIndex] = newNums1[index1];
                index1++;
            }
            else{
                nums1[answerIndex] = nums2[index2];
                index2++;
            }
            answerIndex++;
        }
        while (answerIndex < m+n){
            if(index1 < m) {
                nums1[answerIndex] = newNums1[index1];
                index1++;
            } else{
                nums1[answerIndex] = nums2[index2];
                index2++;
            }
        answerIndex++;
        }
    }
}

// building array from end to beginning (shorter)
class Solution2{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1;
        int i2 = n-1;
        int index = m+n-1;
        while(i1 >= 0 && i2 >= 0){
            if (nums1[i1] >= nums2[i2]) {
                nums1[index--] = nums1[i1--];
            }
            else{
                nums1[index--] = nums2[i2--];
            }
        }
        while(i2 >= 0){
            nums1[index--] = nums2[i2--];
        }
    }
}
