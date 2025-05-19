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
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        return findMax(root);
    }
    int findMax(TreeNode node){
        if(node==null){
return  0;
        }
        int lh=getheight(node.left);
        int rh=getheight(node.right);
        maxi=Math.max(maxi,lh+rh);
        findMax(node.left);
        findMax(node.right);
        return maxi;
    }
    int getheight(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh=getheight(node.left);
        int rh=getheight(node.right);
        return Math.max(lh,rh)+1;
    }
}