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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
    
     int depth=0;
        if(root==null){
            return 0;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int num=queue.size();
             
            for(int i=0;i<num;i++){
               
               TreeNode node=queue.poll();
               if(node.left!=null){
                queue.offer(node.left);
               }
               if(node.right!=null){
                queue.offer(node.right);
               }
              
            }
            depth++;
           
        }
        return depth;
    }
}