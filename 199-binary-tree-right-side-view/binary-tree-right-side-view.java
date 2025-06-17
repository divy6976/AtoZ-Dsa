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
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
           int level=queue.size();
           for(int i=0;i<level;i++){
             TreeNode node=queue.poll();
             if(i==level-1){
                result.add(node.val);
             }
             if(node.left!=null){
                queue.offer(node.left);
             }
             if(node.right!=null){
                queue.offer(node.right);
             }
           }

        }
return result;
    }
}