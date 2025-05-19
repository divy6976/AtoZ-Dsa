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
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
      path(root);
      return maxi;
    }
    int path(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh=getheight(node.left);
        int rh=getheight(node.right);
        maxi=Math.max(maxi,node.val+rh+lh);
        path(node.left);
        path(node.right);
        return maxi;
    }
    int getheight(TreeNode node){
        if(node==null){
            return 0;

        }
        int lh=getheight(node.left);
        int rh=getheight(node.right);
   
    return Math.max(0, node.val + Math.max(lh, rh));
    }
}