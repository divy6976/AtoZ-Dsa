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
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int level=queue.size();
            ArrayList<Integer> numlist=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);


                }
                if(node.right!=null){
                    queue.offer(node.right);
                }

numlist.add(node.val);

            }
            ans.add(numlist.get(numlist.size()-1));
        }
return ans;
    }
}