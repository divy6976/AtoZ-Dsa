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


  boolean  path(TreeNode node,TreeNode p,ArrayList<TreeNode>list1){
        if(node==null){
            return false;
        }
list1.add(node);
if(node.val==p.val){
    return true;
}
if(path(node.left,p,list1) || path(node.right,p,list1)){
    return true;
}
list1.remove(list1.size()-1);
return false;
    }

  boolean  path2(TreeNode node,TreeNode q,ArrayList<TreeNode>list2){
        if(node==null){
            return false;
        }
list2.add(node);
if(node.val==q.val){
    return true;
}
if(path2(node.left,q,list2) || path2(node.right,q,list2)){
    return true;
}
list2.remove(list2.size()-1);
return false;
    }




    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode>list1=new ArrayList<>();
         ArrayList<TreeNode>list2=new ArrayList<>();
TreeNode ans=null;
         path(root,p,list1);
         path2(root,q,list2);
         for(int i=0;i<list1.size();i++){
            for(int j=i;j<list2.size();j++){
                if(list2.get(j)!=list1.get(i)){
                    break;
                }

                ans=list1.get(i);
break;
            }

         }
        
return ans;
    }
}