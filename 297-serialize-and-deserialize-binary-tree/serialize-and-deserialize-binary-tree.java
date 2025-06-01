/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return " ";
        Queue<TreeNode>q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
                res.append("n ");
                continue;

            }
            res.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      if (data == null || data.trim().length() == 0|| data.equals("n") ) {
        return null;
    }

    String[] arr = data.split(" ");
    TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    for (int i = 1; i < arr.length;) {
        TreeNode current = q.poll();

        // Left child
        if (!arr[i].equals("n")) {
            TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
            current.left = left;
            q.add(left);
        }
    i++;
    if(i>=arr.length) break;

                           
        // Right child
        if (!arr[i].equals("n")) {
            TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
            current.right = right;
            q.add(right);
        }
        i++;
    }


    return root;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));