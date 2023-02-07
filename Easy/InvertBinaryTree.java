/**
 * Definition for a binary tree node.
 /*Given the root of a binary tree, invert the tree, and return its root.*/
 
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
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            swapNodes(root);
        }
        return root;
    }

    public void swapNodes(TreeNode root) {
        if (root.left != null || root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        } 
        if (root.left != null) {
            swapNodes(root.left);
        }
        if (root.right != null) {
            swapNodes(root.right);
        }
    }
}
