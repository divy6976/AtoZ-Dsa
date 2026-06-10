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

    void check(TreeNode node,ArrayList<Integer> ans){
        if(node == null){
            return ;
        }
        ans.add(node.val);
        check(node.left,ans);
        check(node.right,ans);
    }


    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> ans=new ArrayList<>();

        if(root == null){
            return ans;
        }

        check(root,ans);

        return ans;
        
    }
}