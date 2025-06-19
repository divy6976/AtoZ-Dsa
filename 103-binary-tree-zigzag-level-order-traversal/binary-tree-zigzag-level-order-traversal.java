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
  

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> result=new ArrayList<>();
    
     if(root==null){
        return result;
     }
boolean direc = true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level=queue.size();
             ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<level;i++){
                
                TreeNode node=queue.poll();

                    if(node.left!=null){
                        queue.offer(node.left);
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                    }

               if(direc== true){
                list.add(node.val);
               }else{
                list.add(0,node.val);
               }
              
            }
         direc=!direc;
          result.add(new ArrayList<>(list));

        }

        return result;
    }
}