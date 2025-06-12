/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = null, right = null;

        if (p.val < root.val && q.val < root.val) {
            left = lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            right = lowestCommonAncestor(root.right, p, q);
        } else {
            // This means p and q lie on either side of root
            return root;
        }

        return left != null ? left : right;
    }
}