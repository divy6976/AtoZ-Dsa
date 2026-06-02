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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer> >result=new ArrayList<>();

        if(root == null){
            return result;
        }

        q.offer(root);


        while(!q.isEmpty()){
            int check=q.size();
            ArrayList<Integer> sublist =new ArrayList<>();
            for(int i=0;i<check;i++){
                TreeNode node=q.poll();
                sublist.add(node.val);
                if(node.left != null){
     q.offer(node.left);
                }
                if(node.right != null){
   q.offer(node.right);
                }
              
                
            }
            result.add(sublist);
        }
        return result;
    }
}