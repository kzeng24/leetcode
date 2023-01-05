/**
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


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
    public boolean isValidBST(TreeNode root) {
        return checkChildrenBoundary(root, null, null);
        // OR
        // return checkNodeBoundary(root, null, null);
    }
    
    public boolean checkChildrenBoundary(TreeNode root, TreeNode lowLimit, TreeNode highLimit) {
        if (root == null) {
            return true;
        }
        if ((root.left != null && ((lowLimit != null && root.left.val <= lowLimit.val) || root.left.val >= root.val)) ||
            (root.right != null && ((highLimit != null && root.right.val >= highLimit.val) || root.right.val <= root.val))) {
            return false;
        }
        return helper(root.left, lowLimit, root) && helper(root.right, root, highLimit);
    }
    
    public boolean checkNodeBoundary(TreeNode root, TreeNode lowLimit, TreeNode highLimit) {
        if (root == null) {
            return true;
        }
        if ((lowLimit != null && root.val <= lowLimit.val) || (highLimit != null && root.val >= highLimit.val)) {
            return false;
        }
        return helper2(root.left, lowLimit, root) && helper2(root.right, root, highLimit);
    }
}
