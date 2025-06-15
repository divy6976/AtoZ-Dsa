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
    public int maxDepth(TreeNode root) {
       if(root==null) return 0;
       int left= maxDepth(root.left);
       int right=maxDepth(root.right);
       int curdepth=1;
       int maxi=Math.max(left,right);
       int total=curdepth+maxi;
       return total;
       
    }
}