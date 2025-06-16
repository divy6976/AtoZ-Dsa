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

private int maxi=Integer.MIN_VALUE;
   int diameter(TreeNode node){

        if(node==null) return 0;
        int left=diameter(node.left);
        int right=diameter(node.right);
        int height=1+Math.max(left,right);
        maxi=Math.max(maxi,left+right);

        return height;
       

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        diameter(root);
        return maxi;

    }
}