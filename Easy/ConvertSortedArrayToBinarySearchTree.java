/* Problem:
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one. */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        return helper(0, nums.length - 1, nums);
    }
    
    public TreeNode helper(int leftIndex, int rightIndex, int[] nums){
        if (leftIndex > rightIndex) {
            return null;
        }
        int middle = (leftIndex + rightIndex) / 2;
        return new TreeNode(nums[middle], 
                            helper(leftIndex, middle - 1, nums), 
                            helper(middle + 1, rightIndex, nums));
    }
}
