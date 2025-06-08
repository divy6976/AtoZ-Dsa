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
    boolean yes=true;
   void valid(TreeNode node,long min,long max){
        if(node==null) return;

 if(node.val<=min || node.val>=max){
    yes=false;
    
  
 }
 
valid(node.left,min,node.val);
valid(node.right,node.val,max);
    }
    public boolean isValidBST(TreeNode root) {
      
     valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
     return yes;


    }
}