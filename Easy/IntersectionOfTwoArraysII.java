/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while ((i < nums1.length) && (j < nums2.length)) {
            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }
        int[] arr = new int[list.size()];
        for (int l = 0; l < list.size(); l++) {
            arr[l] = list.get(l);
        }
        return arr;
    }
}
