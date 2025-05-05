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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
     public void inorder(TreeNode node,List<Integer> result){
if(node==null){
    return ;
}

inorder(node.left,result);

inorder(node.right,result);
result.add(node.val);
    }

}