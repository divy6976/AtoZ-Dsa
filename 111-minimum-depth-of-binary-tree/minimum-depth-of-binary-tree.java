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
    int cnt=Integer.MAX_VALUE;
    void findmin(TreeNode root,int level){

        if(root == null){
            return ;
        }

        if(root.left == null && root.right == null){
            cnt=Math.min(cnt,level);
            return ;
        }

        findmin(root.left,level+1);
        findmin(root.right,level+1);


  
       

    }
    public int minDepth(TreeNode root) {


         if(root == null){
            return 0;
        }
        if(root.left==null && root.right == null){
            return 1;
        }


        findmin(root,1);
        return cnt;

        
    }
}