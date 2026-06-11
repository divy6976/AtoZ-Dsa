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


        List<List<Integer>> ans=new ArrayList<>();
        if(root == null){
            return ans;
        }
        

        
        Queue<TreeNode >q=new LinkedList<>();
        q.offer(root);
  boolean flag =true;

        while(!q.isEmpty()){
          
            int check=q.size();
            ArrayList<Integer> sublist=new ArrayList<>();
            for(int i=0;i<check;i++){
                TreeNode node=q.poll();

                if(node.left !=null){
                    q.offer(node.left);
                }
                if(node.right !=null){
                    q.offer(node.right);
                }

                sublist.add(node.val);

            }
            if(flag){
                ans.add(new ArrayList<>(sublist));
            }else {
               Collections.reverse(sublist);
               ans.add(new ArrayList<>(sublist));
            }
            if(flag){
                flag=false;
            }else {
                flag = true;
            }
        }


        return ans;




        
    }
}