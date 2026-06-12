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

        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();

        if(root.left == null && root.right ==  null){
            ans.add(root.val);
            return ans;
        }

        Queue<TreeNode > q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int check=q.size();
            ArrayList<Integer> sublist=new ArrayList<>();
            for(int i=0;i<check;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right !=null){
                    q.offer(node.right);
                }

                sublist.add(node.val);

            }
            ans.add(sublist.get(sublist.size()-1));
        }
        return ans;


        
    }
}