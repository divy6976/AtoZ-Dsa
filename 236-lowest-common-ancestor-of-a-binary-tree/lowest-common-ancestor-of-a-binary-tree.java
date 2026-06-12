/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    

    boolean check(TreeNode node,TreeNode target,ArrayList<TreeNode> ans){

        if(node == null ) {
            return  false;
        }

        if(node == target){
            
            ans.add(node);
            return true;
        }

        ans.add(node);
        if(check(node.left,target,ans)||check(node.right,target,ans)){
            return true;
        }
   if(ans.size()!=0){
      ans.remove(ans.size()-1);
   }



    return false;



    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        ArrayList<TreeNode> pee=new ArrayList<>();
        ArrayList<TreeNode> qq=new ArrayList<>();
        
       
        check(root,p,pee);

      
        check(root,q,qq);




        TreeNode temp=null;
        for(int i=0;i<Math.min(pee.size(),qq.size()) ; i++){

            if(pee.get(i) != qq.get(i)){
                break;
            }
            temp=pee.get(i);
        }

        return temp;



        
    }
}