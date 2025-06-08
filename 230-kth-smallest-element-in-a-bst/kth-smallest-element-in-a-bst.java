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

 void  Inorder(TreeNode node,  ArrayList<Integer>list){
    if(node==null ) return ;
    Inorder(node.left,list);
    list.add(node.val);
    Inorder(node.right,list);
   }

    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return root.val;
        ArrayList<Integer>list=new ArrayList<>();
        Inorder(root,list);
return list.get(k-1);
    }
}