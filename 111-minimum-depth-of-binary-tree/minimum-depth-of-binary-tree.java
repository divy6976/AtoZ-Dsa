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

    class Pair{
        TreeNode node;
        int cnt;
        Pair(TreeNode node,int cnt){
            this.node=node;
            this.cnt=cnt;
        }
    }


  

    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int mini=Integer.MAX_VALUE;

        Queue<Pair> q=new LinkedList<>();

        q.offer(new Pair(root,1));

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
              Pair p=q.poll();
              TreeNode node =p.node;
              int cnt=p.cnt;

               if(node.left == null && node.right == null){

                mini=Math.min(mini,cnt);
                continue;
              }

              if(node.left!=null){
                q.offer(new Pair(node.left,cnt+1));
              }
              if(node.right!=null){
                q.offer(new Pair(node.right,cnt+1));
              }
             

            }
        }
  return mini;


    }
}