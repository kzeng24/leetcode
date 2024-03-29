/*Given the root of a binary tree, return the inorder traversal of its nodes' values.*/

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return helper(list, root);
    }
    
    public List<Integer> helper(List<Integer> list, TreeNode root) {
        if (root != null) {
            helper(list, root.left);
            list.add(root.val);
            helper(list, root.right);
            return list;
        }
        return list;
    }
}
