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
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode node=s1.pop();
            if(node.left!=null){
                s1.push(node.left);
            }
            if(node.right!=null){
                s1.push(node.right);
            }
            s2.push(node);
        }
        while(!s2.isEmpty()){
            result.add(s2.pop().val);
        }
        return result;


    }
}