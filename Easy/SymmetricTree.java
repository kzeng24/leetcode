/* Problem: 
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).*/

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
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null){
            return true;
        }
        if (leftNode == null || rightNode == null){
            return false;
        }
        return leftNode.val == rightNode.val && helper(leftNode.left, rightNode.right) 
            && helper(leftNode.right, rightNode.left);
    }
}
