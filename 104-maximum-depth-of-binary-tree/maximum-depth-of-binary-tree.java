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
     List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result.size();
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int num=queue.size();
             ArrayList<Integer> sublist=new ArrayList<>();
            for(int i=0;i<num;i++){
               
               TreeNode node=queue.poll();
               if(node.left!=null){
                queue.offer(node.left);
               }
               if(node.right!=null){
                queue.offer(node.right);
               }
               sublist.add(node.val);

            }
            result.add(sublist);
        }
        return result.size();
    }
}