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
    public boolean checkTree(TreeNode root) {
        int ans[]=new int[1];
        sum(root,ans);
        if(ans[0]==1){
            return false;
        }
return true;
    }
    void sum(TreeNode node,int[] ans){
        if(node==null || (node.left==null && node.right==null)){
            return ;
        }
        int leftdata=(node.left!=null) ? node.left.val:0;
        int rightdata=(node.right!=null) ? node.right.val:0;
        if((leftdata+rightdata) !=node.val){
            ans[0]=1;
        }
        sum(node.left,ans);
        sum(node.right,ans);

    }
}