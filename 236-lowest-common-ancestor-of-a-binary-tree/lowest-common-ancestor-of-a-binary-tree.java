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
boolean forp(TreeNode  node,TreeNode p,ArrayList<TreeNode>list1){
    if(node==null) return false;

    list1.add(node);
    if(node.val==p.val) return true;
    if(forp(node.left,p,list1) || forp(node.right,p,list1)){
        return true;
    }
    list1.remove(list1.size()-1);
    return false;
}

boolean forq(TreeNode  node,TreeNode q,ArrayList<TreeNode>list2){
    if(node==null) return false;

    list2.add(node);
    if(node.val==q.val) return true;
    if(forq(node.left,q,list2) || forq(node.right,q,list2)){
        return true;
    }
    list2.remove(list2.size()-1);
    return false;
}


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> list1=new ArrayList<>();
        ArrayList<TreeNode> list2=new ArrayList<>();
        TreeNode result=new TreeNode(0);
        forp(root,p,list1);
        forq(root,q,list2);
        for(int i=0;i<list1.size();i++){
            for(int j=i;j<list2.size();j++){
             
               if(list1.get(i)==list2.get(j)){
                result=list2.get(j);
                break;
               }
            }
        
        }

return result;

    }
}