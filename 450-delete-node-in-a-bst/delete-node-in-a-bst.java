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
    TreeNode prev = null;

    void delete(TreeNode node, int key) {
        if (node == null) return;

        if (node.val == key) {
            // CASE 1: Leaf node
            if (node.left == null && node.right == null) {
                if (prev == null) return; // Deleting root with no children
                if (prev.left == node) prev.left = null;
                else prev.right = null;
                return;
            }

            // CASE 2: Node with only one child
            if (node.left == null || node.right == null) {
                TreeNode child = (node.left != null) ? node.left : node.right;
                if (prev == null) { // root node being deleted
                    node.val = child.val;
                    node.left = child.left;
                    node.right = child.right;
                    return;
                }
                if (prev.left == node) prev.left = child;
                else prev.right = child;
                return;
            }

            // CASE 3: Node with two children
            // Find inorder successor (smallest in right subtree)
            TreeNode successor = node.right;
            TreeNode successorParent = node;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            node.val = successor.val; // Replace current node's value
            // Delete the successor
            prev = successorParent;
            if (successorParent.left == successor) {
                delete(successorParent.left, successor.val);
            } else {
                delete(successorParent.right, successor.val);
            }

            return;
        }

        // Go left or right
        prev = node;
        if (key < node.val) {
            delete(node.left, key);
        } else {
            delete(node.right, key);
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        // Special case: root node is the one to delete and needs replacement
        if (root == null) return null;

        // If root itself is the node to delete and has no parent
        if (root.val == key && root.left == null && root.right == null) {
            return null;
        }

        // If root itself has only one child
        if (root.val == key && (root.left == null || root.right == null)) {
            return (root.left != null) ? root.left : root.right;
        }

        // Now call recursive delete
        delete(root, key);
        return root;
    }
}