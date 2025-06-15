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
  private boolean valid = true;

  int   depth(TreeNode node){
if(node==null) return 0;
int left=depth(node.left);
int right=depth(node.right);
if(Math.abs(left-right)>1){
    valid=false;
}
return 1+Math.max(left,right);


    }

    public boolean isBalanced(TreeNode root) {
       
        if(root==null) return true;
depth(root);
        if(valid==true){
            return true;
        }
        return false;
    }
}