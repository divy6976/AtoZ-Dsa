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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
       
        return bst(preorder,Integer.MAX_VALUE);
    }
    TreeNode bst(int[] preorder,int max){
        if(i==preorder.length || preorder[i]>max){
            return null;
        }
        TreeNode root=new TreeNode(preorder[i++]);
        root.left=bst(preorder,root.val);
        root.right=bst(preorder,max);
        return root;
    }
}