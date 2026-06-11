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

    void dfs(TreeNode node,TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> mpp,int col,int level){
        if(node == null){
            return ;

        }

        if(!mpp.containsKey(col)){
            mpp.put(col,new TreeMap<>());
        }

        if(!mpp.get(col).containsKey(level)){
            mpp.get(col).put(level,new ArrayList<>());
        }

        mpp.get(col).get(level).add(node.val);

        dfs(node.left,mpp,col-1,level+1);
        dfs(node.right,mpp,col+1,level+1);




    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> mpp=new TreeMap<>();

List<List<Integer>> ans=new ArrayList<>();
// col ->[row->[],row->[]];

        dfs(root,mpp,0,0);
// coln wise
        for(Map.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> entry:mpp.entrySet()){
   TreeMap<Integer,ArrayList<Integer>> levelwise=entry.getValue();
   

   ArrayList<Integer> list=new ArrayList<>();

   for(Map.Entry<Integer,ArrayList<Integer>> subentry:levelwise.entrySet()){
    ArrayList<Integer> sublist=subentry.getValue();
    Collections.sort(sublist);
    list.addAll(sublist);
   }
   ans.add(new ArrayList<>(list));

        }
        return ans;
        
    }
}