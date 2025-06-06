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
TreeNode prev=null;
   void  insert(TreeNode node,int val){
        if(node==null){
TreeNode in=new TreeNode(val);
if(val<prev.val){
    prev.left=in;
}else{
    prev.right=in;
}
return;

        }
     if(val<node.val){
        prev=node;
        insert(node.left,val);
     }else{
        prev=node;
        insert(node.right,val);
     }
     }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) {
             root=new TreeNode(val);
            return root;
        }
        insert(root,val);
        return root;
    }
}