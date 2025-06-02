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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>result=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            result.add(curr.val);
            if(curr.left!=null){
                TreeNode leftnode=curr.left;
                while(leftnode.right!=null){
                    leftnode=leftnode.right;

                }
                leftnode.right=curr.right;
                TreeNode temp=curr;
                curr=curr.left;
                temp.left=null;

            }else{
                curr=curr.right;
            }
        }
        return result;
    }
}