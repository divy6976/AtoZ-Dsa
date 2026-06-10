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
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        int cnt=Integer.MAX_VALUE;
        int compare =1;
     
     Queue<TreeNode > q=new LinkedList<>();

     q.offer(root);

     while(!q.isEmpty()){
        int check=q.size();
        for(int i=0;i<check;i++){
            TreeNode node =q.poll();
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right !=null){
                q.offer(node.right);
            }
            if(node.left == null && node.right == null){
                cnt = Math.min(cnt,compare);
            }
        }
        compare ++;
     }

     return cnt;

        
    }
}