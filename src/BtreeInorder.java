import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
// no.94

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
    InOrder : left self right
    PreOrder : self left right
    PostOrder : left right self
 */

public class BtreeInorder {
    List<Integer> ret;
    public List<Integer> inorderTraversal(TreeNode root) {
        ret = new ArrayList<Integer>();
        traverse(root);
        return ret;
    }

    public void traverse(TreeNode self) {
        if(self == null) return;

        traverse(self.left);
        ret.add(self.val);
        traverse(self.right);
    }
}
